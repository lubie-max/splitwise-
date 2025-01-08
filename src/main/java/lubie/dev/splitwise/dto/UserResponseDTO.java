package lubie.dev.splitwise.dto;


import lombok.Data;

import java.util.UUID;

@Data
public class UserResponseDTO {

    private  String username;
    private UUID uuid;
    private  String email;


    public UserResponseDTO(UUID id, String username, String email) {
        this.uuid = id;
        this.username = username;
        this.email = email;
    }
}
