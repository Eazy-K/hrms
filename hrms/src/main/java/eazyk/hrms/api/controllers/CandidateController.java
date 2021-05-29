package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.CandidateService;
import eazyk.hrms.business.abstracts.UserService;
import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.entitites.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;



    @GetMapping("/getAll")
    public List<Candidate> getAll() {

        return this.candidateService.getAll();
    }

    @PostMapping("/add")
    public Candidate add (@RequestBody Candidate candidate) {


        return this.candidateService.add(candidate);
    }





}
