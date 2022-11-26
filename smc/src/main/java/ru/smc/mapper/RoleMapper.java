package ru.smc.mapper;

import ru.smc.dto.RoleDto;
import ru.smc.model.Role;

import java.util.Set;
import java.util.stream.Collectors;

public interface RoleMapper {

    Role toEntity(RoleDto dto);
    RoleDto toDto(Role entity);
    default Set<Role> toEntities(Set<RoleDto> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toSet());
    }
    default Set<RoleDto> toDtos(Set<Role> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toSet());
    }
}
