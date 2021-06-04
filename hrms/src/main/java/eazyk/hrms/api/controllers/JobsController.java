package eazyk.hrms.api.controllers;



import eazyk.hrms.business.abstracts.JobService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.JobDtoAdd;
import eazyk.hrms.entitites.dtos.JobDtoGet;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/jobs")
public class JobsController {


    private final JobService jobService;

    @GetMapping("/getAll")
    public DataResult<List<JobDtoGet>> getByJobName() {
        return this.jobService.getJobDetails();
    }

    @PostMapping("/add")
    public Result add (@RequestBody JobDtoAdd jobDtoAdd) {
        return this.jobService.add(jobDtoAdd);
    }


}
