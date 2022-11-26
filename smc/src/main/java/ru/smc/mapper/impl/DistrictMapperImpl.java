package ru.smc.mapper.impl;

import org.springframework.stereotype.Component;
import ru.smc.dto.DistrictDto;
import ru.smc.mapper.DistrictMapper;
import ru.smc.model.District;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DistrictMapperImpl implements DistrictMapper {

    @Override
    public District toEntity(DistrictDto dto) {
        if (dto == null) {
            return null;
        }
        District entity = new District();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

    @Override
    public DistrictDto toDto(District entity) {
        if (entity == null) {
            return null;
        }
        DistrictDto dto = new DistrictDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public List<District> toEntities(List<DistrictDto> dtoList) {
        return dtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<DistrictDto> toDtos(List<District> entitiesList) {
        return entitiesList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
