package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.JobService;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.JobDao;
import eazyk.hrms.entitites.concretes.Job;
import eazyk.hrms.entitites.dtos.JobDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobManager implements JobService {

    @Autowired
    private JobDao jobDao;

    @Autowired
    private ModelMapper modelMapper;



    @Override
    public DataResult<List<JobDto>> getJobDetails() {
        List<Job> jobs = this.jobDao.findAll();
        List<JobDto> jobDtos = jobs.stream().map(job -> modelMapper.map(job, JobDto.class)).collect(Collectors.toList());

        return new SuccessDataResult<List<JobDto>>
                ("Data listelendi.", jobDtos);
    }

    @Override
    public Result add(JobDto jobDto) {

        Job job = modelMapper.map(jobDto, Job.class);

        if (this.jobDao.existsByJobName(jobDto.getJobName())) {
            return new ErrorResult("Meslek grubu sistemde mevcut");
        }

        modelMapper.map(jobDao.save(job), JobDto.class);
        return new SuccessResult("Meslek eklendi.");
    }


}
