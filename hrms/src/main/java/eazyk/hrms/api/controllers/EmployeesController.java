package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.EmployeeService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.EmployeeDtoAdd;
import eazyk.hrms.entitites.dtos.EmployeeDtoGet;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeesController {


    private final EmployeeService employeeService;

    @GetMapping("/getAll")
    public DataResult<List<EmployeeDtoGet>> getAll() {
        return this.employeeService.getAll();
    }

    @PostMapping("/add")
    public Result add (@RequestBody EmployeeDtoAdd employeeDtoAdd) {
        return this.employeeService.add(employeeDtoAdd);
    }


}
