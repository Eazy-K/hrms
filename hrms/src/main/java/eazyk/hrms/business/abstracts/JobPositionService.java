package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.JobPosition;
import eazyk.hrms.entitites.dtos.requests.JobPositionAddRequest;
import eazyk.hrms.entitites.dtos.responses.JobPositionResponse;

import java.util.List;

public interface JobPositionService {

    DataResult<List<JobPositionResponse>> getAllJobPositions();
    Result saveJobPosition(JobPositionAddRequest jobPositionAddRequest);
    JobPosition getByJobId(int jobId);


}
