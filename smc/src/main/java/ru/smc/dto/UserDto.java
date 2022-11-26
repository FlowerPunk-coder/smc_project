package ru.smc.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.smc.model.Role;
import ru.smc.model.enums.Position;
import ru.smc.model.enums.UserStatus;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
public class UserDto {

    private long id;
    private String name;
    private String lastName;
    private Position position;
    private UserStatus status;
    private String email;
    private String password;
    private Set<RoleDto> roles;
    private List<TaskDto> tasks;
}
