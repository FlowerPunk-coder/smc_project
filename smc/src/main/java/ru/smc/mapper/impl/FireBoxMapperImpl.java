package ru.smc.mapper.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.smc.dto.FireBoxDto;
import ru.smc.mapper.EntranceMapper;
import ru.smc.mapper.FireBoxMapper;
import ru.smc.model.FireBox;

@Component
@RequiredArgsConstructor
public class FireBoxMapperImpl implements FireBoxMapper {

    private final EntranceMapper entranceMapper;

    @Override
    public FireBox toEntity(FireBoxDto dto) {
        if (dto == null) {
            return null;
        }
        FireBox entity = new FireBox();
        entity.setId(dto.getId());
        entity.setComplete(dto.getComplete());
        entity.setEntrance(entranceMapper.toEntity(dto.getEntrance()));
        return entity;
    }

    @Override
    public FireBoxDto toDto(FireBox entity) {
        if (entity == null) {
            return null;
        }
        FireBoxDto dto = new FireBoxDto();
        dto.setId(entity.getId());
        dto.setComplete(entity.getComplete());
        dto.setEntrance(entranceMapper.toDto(entity.getEntrance()));
        return dto;
    }
}
