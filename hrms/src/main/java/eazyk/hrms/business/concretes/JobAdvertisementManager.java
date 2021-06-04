package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.CityService;
import eazyk.hrms.business.abstracts.EmployerService;
import eazyk.hrms.business.abstracts.JobAdvertisementService;
import eazyk.hrms.business.abstracts.JobService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.JobAdvertisementDao;
import eazyk.hrms.entitites.concretes.City;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.concretes.Job;
import eazyk.hrms.entitites.concretes.JobAdvertisement;
import eazyk.hrms.entitites.dtos.JobAdvertisementDtoAdd;
import eazyk.hrms.entitites.dtos.JobAdvertisementDtoGet;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class JobAdvertisementManager implements JobAdvertisementService {


    private final JobAdvertisementDao jobAdvertisementDao;

    private final ModelMapper modelMapper;

    private final EmployerService employerService;

    private final JobService jobService;

    private final CityService cityService;


    public Result add(JobAdvertisementDtoAdd jobAdvertisementDtoAdd) {

        JobAdvertisement jobAdvertisement = this.modelMapper.map(jobAdvertisementDtoAdd, JobAdvertisement.class);

        Employer employer = this.employerService.getByUserId(jobAdvertisementDtoAdd.getEmployerId());
        Job job = this.jobService.getByJobId(jobAdvertisementDtoAdd.getJobId());
        City city = this.cityService.getByCityId(jobAdvertisementDtoAdd.getCityId());

        jobAdvertisement.setEmployers(employer);
        jobAdvertisement.setJobs(job);
        jobAdvertisement.setCities(city);

        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İş ilanı oluşturuldu.");
    }

    @Override
    public DataResult<List<JobAdvertisementDtoGet>> getAll() {

        List<JobAdvertisement> jobAdvertisements = this.jobAdvertisementDao.findAll();
        List<JobAdvertisementDtoGet> jobAdvertisementDtoGets = jobAdvertisements.stream().map(jobAdvertisement -> modelMapper.map(jobAdvertisement, JobAdvertisementDtoGet.class)).collect(Collectors.toList());

         return new SuccessDataResult<List<JobAdvertisementDtoGet>>
                 ("Data listelendi.", jobAdvertisementDtoGets);
    }

    @Override
    public DataResult<List<JobAdvertisementDtoGet>> getByPositionIsActiveIsTrue() {

        List<JobAdvertisement> jobAdvertisements = this.jobAdvertisementDao.getByPositionIsActiveIsTrue();
        List<JobAdvertisementDtoGet> jobAdvertisementDtoGets = jobAdvertisements.stream().map(jobAdvertisement -> modelMapper.map(jobAdvertisement, JobAdvertisementDtoGet.class)).collect(Collectors.toList());

        return new SuccessDataResult<List<JobAdvertisementDtoGet>>("Data listelendi.", jobAdvertisementDtoGets);

    }

    @Override
    public DataResult<List<JobAdvertisementDtoGet>> getByPositionIsActiveIsTrueOrderByReleaseDAte() {

        List<JobAdvertisement> jobAdvertisements = this.jobAdvertisementDao.getByPositionIsActiveIsTrueOrderByReleaseDAte();
        List<JobAdvertisementDtoGet> jobAdvertisementDtoGets = jobAdvertisements.stream().map(jobAdvertisement -> modelMapper.map(jobAdvertisement, JobAdvertisementDtoGet.class)).collect(Collectors.toList());


        return new SuccessDataResult<List<JobAdvertisementDtoGet>>("Data listelendi.", jobAdvertisementDtoGets);
    }

    @Override
    public DataResult<List<JobAdvertisementDtoGet>> getByPositionIsActiveIsTrueAndAndEmployersCompanyName(String companyName) {

        List<JobAdvertisement> jobAdvertisements = this.jobAdvertisementDao.getByPositionIsActiveIsTrueAndAndEmployersCompanyName(companyName);
        List<JobAdvertisementDtoGet> jobAdvertisementDtoGets = jobAdvertisements.stream().map(jobAdvertisement -> modelMapper.map(jobAdvertisement, JobAdvertisementDtoGet.class)).collect(Collectors.toList());

        return new SuccessDataResult<List<JobAdvertisementDtoGet>>("Data listelendi.", jobAdvertisementDtoGets);



    }


}
