package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.JobAdvertisementService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.entitites.concretes.JobAdvertisement;
import eazyk.hrms.entitites.dtos.JobAdvertisementDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementController{

    @Autowired
    private JobAdvertisementService jobAdvertisementService;

    @PostMapping("/add")
    public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
        return this.jobAdvertisementService.add(jobAdvertisement);

    }
    @GetMapping("/getAll")
    public DataResult<List<JobAdvertisementDto>> getAll() {
        return this.jobAdvertisementService.getAll();
    }


}
