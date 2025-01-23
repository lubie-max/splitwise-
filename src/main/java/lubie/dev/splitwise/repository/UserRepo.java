package lubie.dev.splitwise.repository;

import lubie.dev.splitwise.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<Users , Long> {


//    Optional<Users> findById(UUID uuid);

    Users findByUsername(String username);
}
