package ru.smc.mapper;

import ru.smc.dto.DistrictDto;
import ru.smc.model.District;

import java.util.List;

public interface DistrictMapper {

    District toEntity(DistrictDto dto);
    DistrictDto toDto(District entity);
    List<District> toEntities(List<DistrictDto> dtoList);
    List<DistrictDto> toDtos(List<District> entitiesList);
}
