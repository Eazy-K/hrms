package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.EmployeeService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.concretes.Employee;
import eazyk.hrms.entitites.concretes.Job;
import eazyk.hrms.entitites.dtos.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAll")
    public DataResult<List<EmployeeDto>> getAll() {
        return this.employeeService.getAll();
    }

    @PostMapping("/add")
    public Result add (@RequestBody Employee employee) {


        return this.employeeService.add(employee);
    }


}
