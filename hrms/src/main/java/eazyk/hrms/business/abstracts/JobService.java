package eazyk.hrms.business.abstracts;

import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.concretes.Job;

import java.util.List;

public interface JobService {

    List<Job> getAll();
    Job add(Job job);


}
