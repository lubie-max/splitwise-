package lubie.dev.splitwise.service;


import lubie.dev.splitwise.model.Users;
import lubie.dev.splitwise.repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private  JwtService  jwtService;

    public Users register(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        return  repo.save(user);
    }

    public ArrayList<Users> getAllUsers(){
        return (ArrayList<Users>) repo.findAll();
    }

    public String verify(Users user) {

        Authentication authentication =
                manager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if (authentication.isAuthenticated()){
            String token = jwtService.generateToken(user.getUsername());
            return token ;
        }

        return "UnAuthorized";
    }
}
