package eazyk.hrms.api.controllers;



import eazyk.hrms.business.abstracts.JobService;
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
    public List<Job> getAll() {
        return this.jobService.getAll();
    }

    @PostMapping("/add")
    public Job add (@RequestBody Job job) {
        return this.jobService.add(job);
    }


}
