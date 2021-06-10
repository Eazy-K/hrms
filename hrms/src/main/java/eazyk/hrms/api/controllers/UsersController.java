package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.UserService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.abstracts.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UsersController {


    private final UserService userService;

    @PostMapping("/saveUser")
    public Result add(@RequestBody User user) {
        return this.userService.saveUser(user);
    }


    @GetMapping("/getUsers")
    public DataResult<List<User>> getAll() {
        return this.userService.getAllUsers();
    }



}
