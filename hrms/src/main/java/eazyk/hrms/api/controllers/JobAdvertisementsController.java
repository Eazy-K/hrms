package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.JobAdvertisementService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.JobAdvertisementDtoAdd;
import eazyk.hrms.entitites.dtos.JobAdvertisementDtoGet;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {


    private final JobAdvertisementService jobAdvertisementService;

    @PostMapping("/add")
    public Result add(@RequestBody JobAdvertisementDtoAdd jobAdvertisementDtoAdd) {
        return this.jobAdvertisementService.add(jobAdvertisementDtoAdd);

    }
    @GetMapping("/getAll")
    public DataResult<List<JobAdvertisementDtoGet>> getAll() {
        return this.jobAdvertisementService.getAll();
    }


}
