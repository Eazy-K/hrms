package eazyk.hrms.business.abstracts;

import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.entitites.concretes.Candidate;

import java.util.List;

public interface CandidateService {

    List<Candidate> getAll();

    Candidate add(Candidate candidate);
}
