package lubie.dev.splitwise.service;

import lubie.dev.splitwise.model.UserPrincipal;
import lubie.dev.splitwise.model.Users;
import lubie.dev.splitwise.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByUsername(username);

        if (user == null){
            System.out.println("User not found");

            throw  new  UsernameNotFoundException("User is not found!!");
        }

        return  new UserPrincipal(user);
    }
}
