package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.JobPositionService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.JobPositionDao;
import eazyk.hrms.entitites.concretes.JobPosition;
import eazyk.hrms.entitites.dtos.requests.JobPositionAddRequest;
import eazyk.hrms.entitites.dtos.responses.JobPositionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class JobPositionPositionManager implements JobPositionService {


    private final JobPositionDao jobPositionDao;

    private final DtoConverterService dtoConverterService;


    @Override
    public DataResult<List<JobPositionResponse>> getAllJobPositions() {

        return new SuccessDataResult<List<JobPositionResponse>>
                ("Data listelendi.",
                        this.dtoConverterService.dtoConverter(this.jobPositionDao.findAll(), JobPositionResponse.class));
    }

    @Override
    public Result saveJobPosition(JobPositionAddRequest jobPositionAddRequest) {

        JobPosition jobPosition = (JobPosition) this.dtoConverterService.dtoClassConverter(jobPositionAddRequest, JobPosition.class);

        if (this.jobPositionDao.existsByJobName(jobPosition.getJobName())) {
            return new ErrorResult("Meslek grubu sistemde mevcut");
        }

        this.jobPositionDao.save(jobPosition);
        return new SuccessResult("Meslek eklendi.");
    }

    @Override
    public JobPosition getByJobId(int jobId) {
        return this.jobPositionDao.getByJobId(jobId);
    }


}
