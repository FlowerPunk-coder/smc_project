package ru.smc.mapper.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.smc.dto.TaskDto;
import ru.smc.mapper.TaskMapper;
import ru.smc.mapper.UserMapper;
import ru.smc.model.Task;

@Component
@RequiredArgsConstructor
public class TaskMapperImpl implements TaskMapper {

    private final UserMapper userMapper;

    @Override
    public Task toEntity(TaskDto dto) {
        if (dto == null) {
            return null;
        }
        Task entity = new Task();
        entity.setId(dto.getId());
        entity.setAddress(dto.getAddress());
        entity.setDate(dto.getDate());
        entity.setUser(userMapper.toEntity(dto.getUserDto()));
        return entity;
    }

    @Override
    public TaskDto toDto(Task entity) {
        if (entity == null) {
            return null;
        }
        TaskDto dto = new TaskDto();
        dto.setId(entity.getId());
        dto.setAddress(entity.getAddress());
        dto.setDate(entity.getDate());
        dto.setUserDto(userMapper.toDto(entity.getUser()));
        return dto;
    }
}
