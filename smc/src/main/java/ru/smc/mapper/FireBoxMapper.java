package ru.smc.mapper;

import ru.smc.dto.FireBoxDto;
import ru.smc.model.FireBox;

import java.util.List;
import java.util.stream.Collectors;

public interface FireBoxMapper {

    FireBox toEntity(FireBoxDto dto);
    FireBoxDto toDto(FireBox entity);
    default List<FireBox> toEntities(List<FireBoxDto> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
    default List<FireBoxDto> toDtos(List<FireBox> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }
}
