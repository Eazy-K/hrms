package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.CityService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.CityAddRequest;
import eazyk.hrms.entitites.dtos.responses.CityResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cities")
public class CitiesController {

    private final CityService cityService;

    @PostMapping("saveCity")
    public Result saveCity(@RequestBody CityAddRequest cityAddRequest) {
        return this.cityService.saveCity(cityAddRequest);
    }

    @GetMapping("/getAllCities")
    public DataResult<List<CityResponse>> getAllCities() {
        return this.cityService.getAllCities();

    }





}
