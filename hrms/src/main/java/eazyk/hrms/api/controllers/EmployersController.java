package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.EmployerService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.EmployerDtoAdd;
import eazyk.hrms.entitites.dtos.EmployerDtoGet;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/employers")
public class EmployersController {


    private final EmployerService employerService;

    @GetMapping("/getAll")
    public DataResult<List<EmployerDtoGet>> getAll() {
        return this.employerService.getAll();
    }

    @PostMapping("/add")
    public Result add (@RequestBody EmployerDtoAdd employerDtoAdd) {
        return this.employerService.add(employerDtoAdd);
    }
}
