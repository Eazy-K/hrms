package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.SkillService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.SkillAddRequest;
import eazyk.hrms.entitites.dtos.responses.SkillResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/skill")
public class SkillsController {

    private final SkillService skillService;

    @PostMapping("/saveSkill")
    public Result saveSkill (@RequestBody SkillAddRequest skillAddRequest) {
        return this.skillService.saveSkill(skillAddRequest);
    }

    @GetMapping("/getSkills")
    public DataResult<List<SkillResponse>> getSkills() {
        return this.skillService.getAllSkills();
    }



}
