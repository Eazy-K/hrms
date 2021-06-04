package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.Job;
import eazyk.hrms.entitites.dtos.JobDtoAdd;
import eazyk.hrms.entitites.dtos.JobDtoGet;

import java.util.List;

public interface JobService {

    DataResult<List<JobDtoGet>> getJobDetails();
    Result add(JobDtoAdd jobDtoAdd);
    Job getByJobId(int jobId);


}
