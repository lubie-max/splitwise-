package lubie.dev.splitwise.service;


import lubie.dev.splitwise.model.Users;
import lubie.dev.splitwise.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public Users register(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        return  repo.save(user);
    }

    public ArrayList<Users> getAllUsers(){
        return (ArrayList<Users>) repo.findAll();
    }
}
