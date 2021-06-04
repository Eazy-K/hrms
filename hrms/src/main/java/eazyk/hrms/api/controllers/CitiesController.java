package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.CityService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.CityDtoAdd;
import eazyk.hrms.entitites.dtos.CityDtoGet;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cities")
public class CitiesController {

    private final CityService cityService;

    @GetMapping("/getAllCities")
    public DataResult<List<CityDtoGet>> getAllCities() {
        return this.cityService.getCities();

    }
    @PostMapping("addCity")
    public Result addCity(@RequestBody CityDtoAdd cityDtoAdd) {
        return this.cityService.addCity(cityDtoAdd);
    }




}
