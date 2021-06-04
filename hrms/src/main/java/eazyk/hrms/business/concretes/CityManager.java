package eazyk.hrms.business.concretes;


import eazyk.hrms.business.abstracts.CityService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.CityDao;
import eazyk.hrms.entitites.concretes.City;
import eazyk.hrms.entitites.dtos.CityDtoAdd;
import eazyk.hrms.entitites.dtos.CityDtoGet;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CityManager implements CityService {

    private final CityDao cityDao;

    private final ModelMapper modelMapper;


    @Override
    public Result addCity(CityDtoAdd cityDtoAdd) {
        City city = this.modelMapper.map(cityDtoAdd, City.class);
        this.cityDao.save(city);
        return new SuccessResult("Şehir eklendi.");

    }

    @Override
    public DataResult<List<CityDtoGet>> getCities() {
        List<City> cities = this.cityDao.findAll();
        List<CityDtoGet> cityDtoGets = cities.stream().map(item -> modelMapper.map(item, CityDtoGet.class)).collect(Collectors.toList());

        return new SuccessDataResult("Data listelendi.", cityDtoGets);
    }

    @Override
    public City getByCityId(int cityId) {
        return this.cityDao.getByCityId(cityId);
    }
}
