package lubie.dev.splitwise.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "users")
@Data
public class Users extends Base {

    @Column(unique = true)
    private String username;

    @Column
    private  String email;

    @Column
    private String password;
    @Column
    private String role;

    // Getters and setters
}
