package lubie.dev.splitwise.controller;

import lubie.dev.splitwise.model.Users;
import lubie.dev.splitwise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/new")
public class NewUsers {

    @Autowired
    private UserService userService;

    @PostMapping("reg")
    public Users registerUser(@RequestBody Users user){
        return  userService.register(user);
    }
}
