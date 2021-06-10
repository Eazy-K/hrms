package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.SchoolService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.SchoolAddRequest;
import eazyk.hrms.entitites.dtos.responses.SchoolResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/school")
public class SchoolsController {

    private final SchoolService schoolService;

    @PostMapping("/saveSchool")
    public Result saveSchool (@RequestBody SchoolAddRequest schoolAddRequest) {
        return this.schoolService.saveSchool(schoolAddRequest);
    }

    @GetMapping("/getScholls")
    public DataResult<List<SchoolResponse>> getSchools() {
        return this.schoolService.getAllSchools();
    }



}
