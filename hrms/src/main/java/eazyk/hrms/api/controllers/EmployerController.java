package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.EmployerService;
import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.concretes.Employee;
import eazyk.hrms.entitites.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @GetMapping("/getAll")
    public List<Employer> getAll() {
        return this.employerService.getAll();
    }

    @PostMapping("/add")
    public Employer add (@RequestBody Employer employer) {
        return this.employerService.add(employer);
    }
}
