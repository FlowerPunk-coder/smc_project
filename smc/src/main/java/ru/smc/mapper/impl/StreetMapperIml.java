package ru.smc.mapper.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.smc.dto.StreetDto;
import ru.smc.mapper.StreetMapper;
import ru.smc.model.Street;

@Component
@RequiredArgsConstructor
public class StreetMapperIml implements StreetMapper {

    private final DistrictMapperImpl districtMapper;

    @Override
    public Street toEntity(StreetDto dto) {
        if (dto == null) {
            return null;
        }
        Street entity = new Street();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDistrict(districtMapper.toEntity(dto.getDistrict()));
        return entity;
    }

    @Override
    public StreetDto toDto(Street entity) {
        if (entity == null) {
            return null;
        }
        StreetDto dto = new StreetDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDistrict(districtMapper.toDto(entity.getDistrict()));
        return dto;
    }
}
