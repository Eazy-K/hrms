package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.JobService;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.JobDao;
import eazyk.hrms.entitites.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    @Autowired
    private JobDao jobDao;

    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<List<Job>>("Data listelendi.", this.jobDao.findAll());
    }

    @Override
    public Result add(Job job) {

        if (this.jobDao.existsByJobName(job.getJobName())) {
            return new ErrorResult("Meslek grubu sistemde mevcut");
        }
         this.jobDao.save(job);
         return new SuccessResult("Meslek eklendi.");
    }


}
