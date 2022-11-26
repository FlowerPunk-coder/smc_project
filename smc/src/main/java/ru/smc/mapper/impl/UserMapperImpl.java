package ru.smc.mapper.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.smc.dto.UserDto;
import ru.smc.mapper.RoleMapper;
import ru.smc.mapper.TaskMapper;
import ru.smc.mapper.UserMapper;
import ru.smc.model.User;

@Component
@RequiredArgsConstructor
public class UserMapperImpl implements UserMapper {

    private final TaskMapper taskMapper;
    private final RoleMapper roleMapper;

    @Override
    public User toEntity(UserDto dto) {
        if (dto == null) {
            return null;
        }
        User entity = new User();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setLastName(dto.getLastName());
        entity.setPosition(dto.getPosition());
        entity.setStatus(dto.getStatus());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setRoles(roleMapper.toEntities(dto.getRoles()));
        entity.setTasks(taskMapper.toEntities(dto.getTasks()));
        return entity;
    }

    @Override
    public UserDto toDto(User entity) {
        if (entity == null) {
            return null;
        }
        UserDto dto = new UserDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setLastName(entity.getLastName());
        dto.setPosition(entity.getPosition());
        dto.setStatus(entity.getStatus());
        dto.setEmail(entity.getEmail());
        dto.setPassword(entity.getPassword());
        dto.setRoles(roleMapper.toDtos(entity.getRoles()));
        dto.setTasks(taskMapper.toDtos(entity.getTasks()));
        return dto;
    }
}
