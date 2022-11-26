package ru.smc.mapper.impl;

import org.springframework.stereotype.Component;
import ru.smc.dto.RoleDto;
import ru.smc.mapper.RoleMapper;
import ru.smc.model.Role;

@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role toEntity(RoleDto dto) {
        if (dto == null) {
            return null;
        }
        Role entity = new Role();
        entity.setId(dto.getId());
        entity.setRole(dto.getRole());
        return entity;
    }

    @Override
    public RoleDto toDto(Role entity) {
        if (entity == null) {
            return null;
        }
        RoleDto dto = new RoleDto();
        dto.setId(entity.getId());
        dto.setRole(entity.getRole());
        return dto;
    }
}
