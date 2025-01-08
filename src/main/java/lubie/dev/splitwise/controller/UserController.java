package lubie.dev.splitwise.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @GetMapping("/u")
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok("User end point!!");
    }
}
