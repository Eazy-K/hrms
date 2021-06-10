package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.City;
import eazyk.hrms.entitites.dtos.requests.CityAddRequest;
import eazyk.hrms.entitites.dtos.responses.CityResponse;

import java.util.List;

public interface CityService {

    Result saveCity(CityAddRequest cityAddRequest);

    DataResult<List<CityResponse>> getAllCities();

    City getByCityId(int cityId);



}
