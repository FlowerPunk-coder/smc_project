package ru.smc.mapper;

import ru.smc.dto.TaskDto;
import ru.smc.model.Task;

import java.util.List;
import java.util.stream.Collectors;

public interface TaskMapper {

    Task toEntity(TaskDto dto);
    TaskDto toDto(Task entity);
    default List<Task> toEntities(List<TaskDto> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
    default List<TaskDto> toDtos(List<Task> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }
}
