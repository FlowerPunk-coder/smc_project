package ru.smc.mapper;

import ru.smc.dto.UserDto;
import ru.smc.model.User;

import java.util.List;
import java.util.stream.Collectors;

public interface UserMapper {

    User toEntity(UserDto dto);
    UserDto toDto(User entity);
    default List<User> toEntities(List<UserDto> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
    default List<UserDto> toDtos(List<User> entitites) {
        return entitites.stream().map(this::toDto).collect(Collectors.toList());
    }
}
