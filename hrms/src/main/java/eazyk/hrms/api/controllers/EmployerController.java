package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.EmployerService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.concretes.Employee;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.dtos.EmployerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @GetMapping("/getAll")
    public DataResult<List<EmployerDto>> getAll() {
        return this.employerService.getAll();
    }

    @PostMapping("/add")
    public Result add (@RequestBody Employer employer) {
        return this.employerService.add(employer);
    }
}
