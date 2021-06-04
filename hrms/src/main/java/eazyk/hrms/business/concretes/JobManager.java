package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.JobService;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.JobDao;
import eazyk.hrms.entitites.concretes.Job;
import eazyk.hrms.entitites.dtos.JobDtoAdd;
import eazyk.hrms.entitites.dtos.JobDtoGet;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class JobManager implements JobService {


    private final JobDao jobDao;


    private final ModelMapper modelMapper;



    @Override
    public DataResult<List<JobDtoGet>> getJobDetails() {
        List<Job> jobs = this.jobDao.findAll();
        List<JobDtoGet> jobDtoGets = jobs.stream().map(item -> modelMapper.map(item, JobDtoGet.class)).collect(Collectors.toList());

        return new SuccessDataResult<List<JobDtoGet>>
                ("Data listelendi.", jobDtoGets);
    }

    @Override
    public Result add(JobDtoAdd jobDtoAdd) {

        Job job = modelMapper.map(jobDtoAdd, Job.class);

        if (this.jobDao.existsByJobName(job.getJobName())) {
            return new ErrorResult("Meslek grubu sistemde mevcut");
        }

        jobDao.save(job);
        return new SuccessResult("Meslek eklendi.");
    }

    @Override
    public Job getByJobId(int jobId) {
        return this.jobDao.getByJobId(jobId);
    }


}
