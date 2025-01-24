package lubie.dev.splitwise.controller;

import lubie.dev.splitwise.model.Users;
import lubie.dev.splitwise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class UserAuth {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user){
        return  userService.register(user);
    }

    @PostMapping("/login")
    public String loginUser(){
        return  "Login";
    }
}
