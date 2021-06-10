package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.CityService;
import eazyk.hrms.business.abstracts.EmployerService;
import eazyk.hrms.business.abstracts.JobAdvertisementService;
import eazyk.hrms.business.abstracts.JobPositionService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.JobAdvertisementDao;
import eazyk.hrms.entitites.concretes.City;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.concretes.JobPosition;
import eazyk.hrms.entitites.concretes.JobAdvertisement;
import eazyk.hrms.entitites.dtos.requests.JobAdvertisementAddRequest;
import eazyk.hrms.entitites.dtos.responses.JobAdvertisementResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class JobAdvertisementManager implements JobAdvertisementService {


    private final JobAdvertisementDao jobAdvertisementDao;

    private final EmployerService employerService;

    private final JobPositionService jobPositionService;

    private final CityService cityService;

    private final DtoConverterService dtoConverterService;


    public Result saveJobAdvertisement(JobAdvertisementAddRequest jobAdvertisementAddRequest) {

        JobAdvertisement jobAdvertisement = (JobAdvertisement) this.dtoConverterService.dtoClassConverter(jobAdvertisementAddRequest, JobAdvertisement.class);

        Employer employer = this.employerService.getById(jobAdvertisementAddRequest.getEmployerId());
        JobPosition jobPosition = this.jobPositionService.getByJobId(jobAdvertisementAddRequest.getJobId());
        City city = this.cityService.getByCityId(jobAdvertisementAddRequest.getCityId());

        jobAdvertisement.setEmployers(employer);
        jobAdvertisement.setJobs(jobPosition);
        jobAdvertisement.setCities(city);

        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İş ilanı oluşturuldu.");
    }

    @Override
    public DataResult<List<JobAdvertisementResponse>> getAllJobAdvertisements() {
         return new SuccessDataResult<List<JobAdvertisementResponse>>
                 ("Data listelendi.",
                         this.dtoConverterService.dtoConverter(this.jobAdvertisementDao.findAll(), JobAdvertisementResponse.class));
    }

    @Override
    public DataResult<List<JobAdvertisementResponse>> getByPositionIsActiveIsTrue() {
        return new SuccessDataResult<List<JobAdvertisementResponse>>("Data listelendi.",
                this.dtoConverterService.dtoConverter(this.jobAdvertisementDao.getByPositionIsActiveIsTrue(), JobAdvertisementResponse.class));

    }

    @Override
    public DataResult<List<JobAdvertisementResponse>> getByPositionIsActiveIsTrueOrderByReleaseDAte() {
        return new SuccessDataResult<List<JobAdvertisementResponse>>("Data listelendi.",
                this.dtoConverterService.dtoConverter(this.jobAdvertisementDao.getByPositionIsActiveIsTrueOrderByReleaseDAte(), JobAdvertisementResponse.class));
    }

    @Override
    public DataResult<List<JobAdvertisementResponse>> getByPositionIsActiveIsTrueAndAndEmployersCompanyName(String companyName) {
        return new SuccessDataResult<List<JobAdvertisementResponse>>("Data listelendi.",
                this.dtoConverterService.dtoConverter(this.jobAdvertisementDao.getByPositionIsActiveIsTrueAndAndEmployersCompanyName(companyName), JobAdvertisementResponse.class));

    }


}
