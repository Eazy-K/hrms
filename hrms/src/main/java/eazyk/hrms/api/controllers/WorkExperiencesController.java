package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.WorkExperienceService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.WorkExperienceAddRequest;
import eazyk.hrms.entitites.dtos.responses.WorkExperienceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/workExperience")
public class WorkExperiencesController {

    private final WorkExperienceService workExperienceService;


    @PostMapping("/saveWorkExperience")
    public Result saveWorkExperience (@RequestBody WorkExperienceAddRequest workExperienceAddRequest) {
        return this.workExperienceService.saveWorkExperience(workExperienceAddRequest);
    }

    @GetMapping("/getWorkExperiences")
    public DataResult<List<WorkExperienceResponse>> getWorkExperience() {
        return this.workExperienceService.getAllWorkExperiences();
    }




}
