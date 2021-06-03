package eazyk.hrms.api.controllers;



import eazyk.hrms.business.abstracts.JobService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.entitites.concretes.Job;
import eazyk.hrms.entitites.dtos.JobDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/getAll")
    public DataResult<List<JobDto>> getByJobName() {
        return this.jobService.getJobDetails();
    }

    @PostMapping("/add")
    public Result add (@RequestBody JobDto jobDto) {
        return this.jobService.add(jobDto);
    }


}
