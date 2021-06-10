package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.WorkExperienceService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.WorkExperienceDao;
import eazyk.hrms.entitites.concretes.WorkExperience;
import eazyk.hrms.entitites.dtos.requests.WorkExperienceAddRequest;
import eazyk.hrms.entitites.dtos.responses.WorkExperienceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class WorkExperienceManager implements WorkExperienceService {

    private final WorkExperienceDao workExperienceDao;

    private final DtoConverterService dtoConverterService;


    @Override
    public Result saveWorkExperience(WorkExperienceAddRequest workExperienceAddRequest) {
       this.workExperienceDao.save((WorkExperience) this.dtoConverterService.dtoClassConverter(workExperienceAddRequest, WorkExperience.class));
        return new SuccessResult("İş tecrübesi eklendi.");
    }

    @Override
    public WorkExperience saveWorkExperience(WorkExperience workExperience) {
        return this.workExperienceDao.save(workExperience);
    }

    @Override
    public DataResult<List<WorkExperienceResponse>> getAllWorkExperiences() {

        return new SuccessDataResult<List<WorkExperienceResponse>>("Data listelendi.",
                this.dtoConverterService.dtoConverter(this.workExperienceDao.findAll(), WorkExperienceResponse.class));
    }

    public WorkExperience getByWorkExerienceId(int workExperienceId) {
        return this.workExperienceDao.getByWorkExperienceId(workExperienceId);
    }

}
