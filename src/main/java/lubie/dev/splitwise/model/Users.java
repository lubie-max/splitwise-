package lubie.dev.splitwise.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class Users extends Base {

    @Column(unique = true)
    private String username;

    private String password;
    private String role;

    // Getters and setters
}
