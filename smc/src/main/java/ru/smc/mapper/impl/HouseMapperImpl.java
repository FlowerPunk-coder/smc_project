package ru.smc.mapper.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.smc.dto.HouseDto;
import ru.smc.mapper.HouseMapper;
import ru.smc.mapper.StreetMapper;
import ru.smc.model.House;

@Component
@RequiredArgsConstructor
public class HouseMapperImpl implements HouseMapper {

    private final StreetMapper streetMapper;
    @Override
    public House toEntity(HouseDto dto) {
        if (dto == null) {
            return null;
        }
        House entity = new House();
        entity.setId(dto.getId());
        entity.setNumber(dto.getNumber());
        entity.setPrefix(dto.getPrefix());
        entity.setSing(dto.getSing());
        entity.setChecked(dto.isChecked());
        entity.setCheckDate(dto.getCheckDate());
        entity.setStreet(streetMapper.toEntity(dto.getStreet()));
        return entity;
    }

    @Override
    public HouseDto toDto(House entity) {
        if (entity == null) {
            return null;
        }
        HouseDto dto = new HouseDto();
        dto.setId(entity.getId());
        dto.setNumber(entity.getNumber());
        dto.setPrefix(entity.getPrefix());
        dto.setSing(entity.getSing());
        dto.setChecked(entity.isChecked());
        dto.setCheckDate(entity.getCheckDate());
        dto.setStreet(streetMapper.toDto(entity.getStreet()));
        return dto;
    }
}
