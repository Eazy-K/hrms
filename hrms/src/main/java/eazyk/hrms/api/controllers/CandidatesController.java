package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.CandidateService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;


import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.dtos.requests.CandidateAddRequest;
import eazyk.hrms.entitites.dtos.responses.CandidateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {


    private final CandidateService candidateService;


    @PostMapping("/saveCAndidate")
    public Result saveCandidate (@RequestBody CandidateAddRequest candidateAddRequest) throws Exception {
        return this.candidateService.saveCandidate(candidateAddRequest);
    }

    @GetMapping("/getCandidates")
    public DataResult<List<CandidateResponse>> getCandidates() {
        return this.candidateService.getAllCandidates();
    }
    @GetMapping("/dfdf")
    public Candidate getCandidateById(@RequestParam int id) {
        return this.candidateService.findById(id);
    }








}
