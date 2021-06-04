package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.CandidateService;
import eazyk.hrms.business.abstracts.CheckService;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.CandidateDao;
import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.dtos.CandidateDtoAdd;
import eazyk.hrms.entitites.dtos.CandidateDtoGet;
import eazyk.hrms.services.mail.abstracts.EmailService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class CandidateManager implements CandidateService {


    private final CandidateDao candidateDao;


    private final CheckService checkService;


    private final EmailService emailService;


    private final ModelMapper modelMapper;


    @Override
    public DataResult<List<CandidateDtoGet>> getAll() {

        List<Candidate>  candidates= this.candidateDao.findAll();
        List<CandidateDtoGet> candidateDtoGets = candidates.stream().map(candidate -> modelMapper.map(candidate, CandidateDtoGet.class)).collect(Collectors.toList());

        return new SuccessDataResult<List<CandidateDtoGet>>
                ("Data listelendi.", candidateDtoGets);
    }

    @Override
    public Result add(CandidateDtoAdd candidateDtoAdd) throws Exception {

        Candidate candidate = this.modelMapper.map(candidateDtoAdd, Candidate.class);

        if (!(this.checkService.isChecked(Long.parseLong(candidate.getIdentificationNumber()),
                candidate.getFirstName(),
                candidate.getLastName(),
                Integer.parseInt(candidate.getBirthday()))
                )) {

             return new ErrorResult( "Kullanıcı bilgileri doğrulanamadı!");
        }
        if(this.candidateDao.existsByEmailOrIdentificationNumber(candidate.getEmail(),
                candidate.getIdentificationNumber())) {
            return new ErrorResult( "Kullanıcı sistemde mevcut!");
        }

        this.candidateDao.save(candidate);
        this.emailService.mailSender("Doğrulama maili gönderildi.");
        return new SuccessResult("Kullanıcı doğrulanıp eklendi.");

    }




}
