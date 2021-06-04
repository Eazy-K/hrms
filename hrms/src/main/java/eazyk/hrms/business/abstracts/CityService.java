package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.City;
import eazyk.hrms.entitites.dtos.CityDtoAdd;
import eazyk.hrms.entitites.dtos.CityDtoGet;

import java.util.List;

public interface CityService {

    Result addCity(CityDtoAdd cityDtoAdd);

    DataResult<List<CityDtoGet>> getCities();

    City getByCityId(int cityId);



}
