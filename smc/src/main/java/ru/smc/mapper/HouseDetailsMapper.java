package ru.smc.mapper;

import ru.smc.dto.HouseDetailsDto;
import ru.smc.model.HouseDetails;

import java.util.List;
import java.util.stream.Collectors;

public interface HouseDetailsMapper {

    HouseDetails toEntity(HouseDetailsDto dto);
    HouseDetailsDto toDto(HouseDetails entity);
    default List<HouseDetails> toEntities(List<HouseDetailsDto> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
    default List<HouseDetailsDto> toDtos(List<HouseDetails> entitiesList) {
        return entitiesList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
