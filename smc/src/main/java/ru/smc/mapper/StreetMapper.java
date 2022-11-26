package ru.smc.mapper;

import ru.smc.dto.StreetDto;
import ru.smc.model.Street;

import java.util.List;
import java.util.stream.Collectors;

public interface StreetMapper {

    Street toEntity (StreetDto dto);
    StreetDto toDto (Street entity);
    default List<Street> toEntities (List<StreetDto> dtoList) {
       return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
    default List<StreetDto> toDtos (List<Street> entitiesList) {
        return entitiesList.stream().map(this::toDto).collect(Collectors.toList());
    }

}
