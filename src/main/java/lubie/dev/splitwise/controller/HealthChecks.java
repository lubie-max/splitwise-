package lubie.dev.splitwise.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthChecks {

    @GetMapping("/health")
    public ResponseEntity<?> checkHealth(){
        return  ResponseEntity.ok("All is well!!");
    }

}
