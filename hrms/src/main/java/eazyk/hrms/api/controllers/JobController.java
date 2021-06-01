package eazyk.hrms.api.controllers;



import eazyk.hrms.business.abstracts.JobService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.entitites.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/getAll")
    public DataResult<List<Job>> getAll() {
        return this.jobService.getAll();
    }

    @PostMapping("/add")
    public Result add (@RequestBody Job job) {
        return this.jobService.add(job);
    }


}
