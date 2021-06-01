package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.entitites.concretes.Candidate;

import java.util.List;

public interface CandidateService {

    List<Candidate> getAll();

    Result add(Candidate candidate) throws Exception;
}
