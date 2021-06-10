package eazyk.hrms.api.controllers;



import eazyk.hrms.business.abstracts.JobPositionService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.JobPositionAddRequest;
import eazyk.hrms.entitites.dtos.responses.JobPositionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/jobs")
public class JobPositionsController {


    private final JobPositionService jobPositionService;

    @PostMapping("/saveJob")
    public Result saveJob (@RequestBody JobPositionAddRequest jobPositionAddRequest) {
        return this.jobPositionService.saveJobPosition(jobPositionAddRequest);
    }

    @GetMapping("/getJobs")
    public DataResult<List<JobPositionResponse>> getJobs() {
        return this.jobPositionService.getAllJobPositions();
    }



}
