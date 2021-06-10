package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.JobAdvertisementAddRequest;
import eazyk.hrms.entitites.dtos.responses.JobAdvertisementResponse;


import java.util.List;

public interface JobAdvertisementService {

    Result saveJobAdvertisement(JobAdvertisementAddRequest jobAdvertisementAddRequest);

    DataResult<List<JobAdvertisementResponse>> getAllJobAdvertisements();

    DataResult<List<JobAdvertisementResponse>> getByPositionIsActiveIsTrue();

    DataResult<List<JobAdvertisementResponse>> getByPositionIsActiveIsTrueOrderByReleaseDAte();

    DataResult<List<JobAdvertisementResponse>> getByPositionIsActiveIsTrueAndAndEmployersCompanyName(String companyName);






}
