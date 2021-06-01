package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.CandidateService;
import eazyk.hrms.business.abstracts.CheckService;
import eazyk.hrms.core.utilities.result.ErrorResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.CandidateDao;
import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.entitites.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    @Autowired
    private CandidateDao candidateDao;

    @Autowired
    public CheckService checkService;


    @Override
    public List<Candidate> getAll() {
        return this.candidateDao.findAll();
    }

    @Override
    public Result add(Candidate candidate) throws Exception {

        if (!this.checkService.isChecked(Long.parseLong(candidate.getIdentificationNumber()), candidate.getFirstName(), candidate.getLastName(), Integer.parseInt(candidate.getBirthday()))) {

             return new ErrorResult(false, "Kullanıcı doğrulanamadı.");
        }
        this.candidateDao.save(candidate);
        return new SuccessResult(true, "Kullanıcı doğrulanıp eklendi.");

    }


}
