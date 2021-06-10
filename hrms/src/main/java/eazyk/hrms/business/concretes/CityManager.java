package eazyk.hrms.business.concretes;


import eazyk.hrms.business.abstracts.CityService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.CityDao;
import eazyk.hrms.entitites.concretes.City;
import eazyk.hrms.entitites.dtos.requests.CityAddRequest;
import eazyk.hrms.entitites.dtos.responses.CityResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CityManager implements CityService {

    private final CityDao cityDao;

    private final DtoConverterService dtoConverterService;


    @Override
    public Result saveCity(CityAddRequest cityAddRequest) {
        this.cityDao.save((City) dtoConverterService.dtoClassConverter(cityAddRequest, City.class));
        return new SuccessResult("Şehir eklendi.");

    }

    @Override
    public DataResult<List<CityResponse>> getAllCities() {
        return new SuccessDataResult("Data listelendi.",
                this.dtoConverterService.dtoConverter(this.cityDao.findAll(), CityResponse.class));
    }

    @Override
    public City getByCityId(int cityId) {
        return this.cityDao.getByCityId(cityId);
    }
}
