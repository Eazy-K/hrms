package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.EmployerService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.EmployerAddRequest;
import eazyk.hrms.entitites.dtos.responses.EmployerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/employers")
public class EmployersController {


    private final EmployerService employerService;

    @PostMapping("/saveEmployer")
    public Result saveEployer (@RequestBody EmployerAddRequest employerAddRequest) {
        return this.employerService.saveEmployer(employerAddRequest);
    }

    @GetMapping("/getEmployers")
    public DataResult<List<EmployerResponse>> getEmployers() {
        return this.employerService.getAllEmployers();
    }


}
