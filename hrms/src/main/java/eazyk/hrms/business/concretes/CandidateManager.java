package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.CandidateService;
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


    @Override
    public List<Candidate> getAll() {
        return this.candidateDao.findAll();
    }

    @Override
    public Candidate add(Candidate candidate) {
        return this.candidateDao.save(candidate);
    }


}
