package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.concretes.Job;

import java.util.List;

public interface JobService {

    DataResult<List<Job>> getAll();
    Result add(Job job);


}
