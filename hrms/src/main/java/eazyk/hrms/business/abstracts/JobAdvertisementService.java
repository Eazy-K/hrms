package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.dataAccess.abstracts.JobAdvertisementDao;
import eazyk.hrms.entitites.concretes.JobAdvertisement;
import eazyk.hrms.entitites.dtos.JobAdvertisementDto;

import java.util.List;

public interface JobAdvertisementService {

    Result add(JobAdvertisement jobAdvertisement);

    DataResult<List<JobAdvertisementDto>> getAll();





}
