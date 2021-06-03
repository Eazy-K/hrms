package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.CandidateService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;

import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.dtos.CandidateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;



    @GetMapping("/getAll")
    public DataResult<List<CandidateDto>> getAll() {

        return this.candidateService.getAll();
    }

    @PostMapping("/add")
    public Result add (@RequestBody Candidate candidate) throws Exception {


        return this.candidateService.add(candidate);
    }





}
