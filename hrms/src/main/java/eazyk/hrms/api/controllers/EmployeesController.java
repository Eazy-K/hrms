package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.EmployeeService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.EmployeeAddRequest;
import eazyk.hrms.entitites.dtos.responses.EmployeeResponse;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeesController {


    private final EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public Result saveEmployee (@RequestBody EmployeeAddRequest employeeAddRequest) {
        return this.employeeService.saveEmployee(employeeAddRequest);
    }

    @GetMapping("/getEmployees")
    public DataResult<List<EmployeeResponse>> getEmployees() {
        return this.employeeService.getAllEmployees();
    }



}
