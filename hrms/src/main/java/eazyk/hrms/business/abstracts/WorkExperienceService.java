package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;

import eazyk.hrms.entitites.concretes.WorkExperience;
import eazyk.hrms.entitites.dtos.requests.WorkExperienceAddRequest;
import eazyk.hrms.entitites.dtos.responses.WorkExperienceResponse;

import java.util.List;

public interface WorkExperienceService {

    Result saveWorkExperience(WorkExperienceAddRequest workExperienceAddRequest);

    WorkExperience saveWorkExperience(WorkExperience workExperience);

    DataResult<List<WorkExperienceResponse>> getAllWorkExperiences();

    WorkExperience getByWorkExerienceId(int workExperienceId);

}
