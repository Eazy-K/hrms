package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.JobAdvertisementDtoAdd;
import eazyk.hrms.entitites.dtos.JobAdvertisementDtoGet;


import java.util.List;

public interface JobAdvertisementService {

    Result add(JobAdvertisementDtoAdd jobAdvertisementDtoAdd);

    DataResult<List<JobAdvertisementDtoGet>> getAll();

    DataResult<List<JobAdvertisementDtoGet>> getByPositionIsActiveIsTrue();

    DataResult<List<JobAdvertisementDtoGet>> getByPositionIsActiveIsTrueOrderByReleaseDAte();

    DataResult<List<JobAdvertisementDtoGet>> getByPositionIsActiveIsTrueAndAndEmployersCompanyName(String companyName);






}
