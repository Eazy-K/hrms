package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.JobAdvertisementService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.JobAdvertisementAddRequest;
import eazyk.hrms.entitites.dtos.responses.JobAdvertisementResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {


    private final JobAdvertisementService jobAdvertisementService;

    @PostMapping("/saveJobAdvertisement")
    public Result saveJobAdvertisement(@RequestBody JobAdvertisementAddRequest jobAdvertisementAddRequest) {
        return this.jobAdvertisementService.saveJobAdvertisement(jobAdvertisementAddRequest);

    }
    @GetMapping("/getAllJobAdvertisements")
    public DataResult<List<JobAdvertisementResponse>> getAllJobAdvertisements() {
        return this.jobAdvertisementService.getAllJobAdvertisements();
    }

    @GetMapping("getAllActiveAdvertisements")
    public DataResult<List<JobAdvertisementResponse>> getAllActiveAdvertisements() {
        return this.jobAdvertisementService.getByPositionIsActiveIsTrue();
    }

    @GetMapping("getByPositionIsActiveIsTrueOrderByReleaseDAte")
    public DataResult<List<JobAdvertisementResponse>> getByPositionIsActiveIsTrueOrderByReleaseDAte() {
        return this.jobAdvertisementService.getByPositionIsActiveIsTrueOrderByReleaseDAte();
    }

    @GetMapping("getByPositionIsActiveIsTrueAndAndEmployersCompanyName")
    public DataResult<List<JobAdvertisementResponse>> getByPositionIsActiveIsTrueAndAndEmployersCompanyName(String companyName) {
        return this.jobAdvertisementService.getByPositionIsActiveIsTrueAndAndEmployersCompanyName(companyName);
    }




}
