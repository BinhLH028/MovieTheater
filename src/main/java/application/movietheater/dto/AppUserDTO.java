package application.movietheater.dto;

import application.movietheater.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserDTO {
    private Integer userId;

    private String userName;

    private String email;

    private Integer age;

    private Role role;

}
