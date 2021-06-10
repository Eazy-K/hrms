package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.CandidateService;
import eazyk.hrms.business.abstracts.CheckService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.CandidateDao;
import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.dtos.requests.CandidateAddRequest;
import eazyk.hrms.entitites.dtos.responses.CandidateResponse;
import eazyk.hrms.services.mail.abstracts.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;



@RequiredArgsConstructor
@Service
public class CandidateManager implements CandidateService {

    private final CandidateDao candidateDao;

    private final CheckService checkService;

    private final EmailService emailService;

    private final DtoConverterService dtoConverterService;



    @Override
    public DataResult<List<CandidateResponse>> getAllCandidates() {

        return new SuccessDataResult<List<CandidateResponse>>("Data listelendi.",
                this.dtoConverterService.dtoConverter(this.candidateDao.findAll(), CandidateResponse.class));
    }

    @Override
    public Result saveCandidate(CandidateAddRequest candidateAddRequest) throws Exception {

        Candidate candidate = (Candidate) this.dtoConverterService.dtoClassConverter(candidateAddRequest, Candidate.class);

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

    @Override
    public Candidate findById(int userId) {
        return this.candidateDao.findById(userId);
    }


}
