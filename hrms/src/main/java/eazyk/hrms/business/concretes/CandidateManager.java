package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.CandidateService;
import eazyk.hrms.business.abstracts.CheckService;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.CandidateDao;
import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.services.mail.abstracts.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    @Autowired
    private CandidateDao candidateDao;

    @Autowired
    private CheckService checkService;

    @Autowired
    private EmailService emailService;


    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>("Data listelendi.", this.candidateDao.findAll());
    }

    @Override
    public Result add(Candidate candidate) throws Exception {

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
