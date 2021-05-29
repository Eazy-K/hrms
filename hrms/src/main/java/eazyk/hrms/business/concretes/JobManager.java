package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.JobService;
import eazyk.hrms.dataAccess.abstracts.JobDao;
import eazyk.hrms.entitites.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    @Autowired
    private JobDao jobDao;

    public List<Job> getAll() {
        return this.jobDao.findAll();
    }

    @Override
    public Job add(Job job) {
        return this.jobDao.save(job);
    }


}
