package lubie.dev.splitwise.controller;


import lubie.dev.splitwise.model.Users;
import lubie.dev.splitwise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity<?> getUsers(){
        List<Users> users = userService.getAllUsers();

        return ResponseEntity.ok(users);
    }

    @PostMapping("/reg")
    public Users registerUser(@RequestBody Users user){
        return  userService.register(user);
    }
}

