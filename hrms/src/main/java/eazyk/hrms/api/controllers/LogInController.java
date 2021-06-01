package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.AuthService;
import eazyk.hrms.core.utilities.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class LogInController {

    @Autowired
    private AuthService authService;

    @PostMapping("/logIn")
    public Result logIn(@RequestParam String email, String password) {
        return this.authService.logIn(email, password);


    }


}
