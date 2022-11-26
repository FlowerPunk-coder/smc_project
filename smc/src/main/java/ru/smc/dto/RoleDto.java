package ru.smc.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.smc.model.enums.Roles;

@Data
@NoArgsConstructor
public class RoleDto {

    private long id;
    private Roles role;
}
