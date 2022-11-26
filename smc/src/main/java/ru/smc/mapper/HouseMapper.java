package ru.smc.mapper;

import ru.smc.dto.HouseDto;
import ru.smc.model.House;

import java.util.List;
import java.util.stream.Collectors;

public interface HouseMapper {

    House toEntity(HouseDto dto);
    HouseDto toDto(House entity);
    default List<House> toEntities(List<HouseDto> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
    default List<HouseDto> toDtos(List<House> entitiesList) {
        return entitiesList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
