package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.CandidateService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;


import eazyk.hrms.entitites.dtos.CandidateDtoAdd;
import eazyk.hrms.entitites.dtos.CandidateDtoGet;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {


    private final CandidateService candidateService;



    @GetMapping("/getAll")
    public DataResult<List<CandidateDtoGet>> getAll() {

        return this.candidateService.getAll();
    }

    @PostMapping("/add")
    public Result add (@RequestBody CandidateDtoAdd candidateDtoAdd) throws Exception {


        return this.candidateService.add(candidateDtoAdd);
    }





}
