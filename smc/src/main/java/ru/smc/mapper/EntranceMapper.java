package ru.smc.mapper;

import ru.smc.dto.EntranceDto;
import ru.smc.model.Entrance;

import java.util.List;
import java.util.stream.Collectors;

public interface EntranceMapper {

    Entrance toEntity(EntranceDto dto);
    EntranceDto toDto(Entrance entity);
    default List<Entrance> toEntities(List<EntranceDto> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
    default List<EntranceDto> toDtos(List<Entrance> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }
}
