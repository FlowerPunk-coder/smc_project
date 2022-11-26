package ru.smc.mapper.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.smc.dto.HouseDetailsDto;
import ru.smc.mapper.HouseDetailsMapper;
import ru.smc.mapper.HouseMapper;
import ru.smc.model.HouseDetails;

@Component
@RequiredArgsConstructor
public class HouseDetailsMapperImpl implements HouseDetailsMapper {

    private final HouseMapper houseMapper;

    @Override
    public HouseDetails toEntity(HouseDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        HouseDetails entity = new HouseDetails();
        entity.setId(dto.getId());
        entity.setSystems(dto.getSystems());
        entity.setLevels(dto.getLevels());
        entity.setEntrances(dto.getEntrances());
        entity.setMultilevel(dto.isMultilevel());
        entity.setComment(dto.getComment());
        entity.setHouse(houseMapper.toEntity(dto.getHouse()));
        return entity;
    }

    @Override
    public HouseDetailsDto toDto(HouseDetails entity) {
        if (entity == null) {
            return null;
        }
        HouseDetailsDto dto = new HouseDetailsDto();
        dto.setId(entity.getId());
        dto.setSystems(dto.getSystems());
        dto.setLevels(entity.getLevels());
        dto.setEntrances(entity.getEntrances());
        dto.setMultilevel(entity.isMultilevel());
        dto.setComment(entity.getComment());
        dto.setHouse(houseMapper.toDto(entity.getHouse()));
        return dto;
    }
}
