package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.AuthService;
import eazyk.hrms.core.utilities.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/")
public class LogInController {


    private final AuthService authService;

    @PostMapping("/logIn")
    public Result logIn(@RequestParam String email, String password) {
        return this.authService.logIn(email, password);


    }


}
