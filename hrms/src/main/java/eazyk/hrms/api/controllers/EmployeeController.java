package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.EmployeeService;
import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.concretes.Employee;
import eazyk.hrms.entitites.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return this.employeeService.getAll();
    }

    @PostMapping("/add")
    public Employee add (@RequestBody Employee employee) {


        return this.employeeService.add(employee);
    }


}