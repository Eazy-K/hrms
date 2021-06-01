package eazyk.hrms.api.controllers;


import eazyk.hrms.business.abstracts.UserService;
import eazyk.hrms.entitites.abstracts.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public List<User> getAll() {

        return this.userService.getAll();
    }

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        return this.userService.add(user);
    }


}
