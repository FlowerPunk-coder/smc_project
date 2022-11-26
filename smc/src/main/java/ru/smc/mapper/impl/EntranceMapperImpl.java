package ru.smc.mapper.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.smc.dto.EntranceDto;
import ru.smc.mapper.EntranceMapper;
import ru.smc.mapper.FireBoxMapper;
import ru.smc.mapper.HouseDetailsMapper;
import ru.smc.model.Entrance;

@Component
@RequiredArgsConstructor
public class EntranceMapperImpl implements EntranceMapper {

    private final HouseDetailsMapper houseDetailsMapper;
    private final FireBoxMapper fireBoxMapper;

    @Override
    public Entrance toEntity(EntranceDto dto) {
        if (dto == null) {
            return null;
        }
        Entrance entity = new Entrance();
        entity.setId(dto.getId());
        entity.setNumberEntrance(dto.getNumberEntrance());
        entity.setLevels(dto.getLevels());
        entity.setFireBoxes(dto.getFireBoxes());
        entity.setPipes(dto.getPipes());
        entity.setFireCranes(dto.getFireCranes());
        entity.setAttic(dto.getAttic());
        entity.setBasement(dto.getBasement());
        entity.setWork(dto.getWork());
        entity.setFirstLevel(dto.isFirstLevel());
        entity.setHouseDetails(houseDetailsMapper.toEntity(dto.getHouseDetailsDto()));
        entity.setFireBox(fireBoxMapper.toEntity(dto.getFireBoxDto()));
        return entity;
    }

    @Override
    public EntranceDto toDto(Entrance entity) {
        if (entity == null) {
            return null;
        }
        EntranceDto dto = new EntranceDto();
        dto.setId(entity.getId());
        dto.setNumberEntrance(entity.getNumberEntrance());
        dto.setLevels(entity.getLevels());
        dto.setFireBoxes(entity.getFireBoxes());
        dto.setPipes(entity.getPipes());
        dto.setFireCranes(entity.getFireCranes());
        dto.setAttic(entity.getAttic());
        dto.setBasement(entity.getBasement());
        dto.setWork(entity.getWork());
        dto.setFirstLevel(entity.isFirstLevel());
        dto.setHouseDetailsDto(houseDetailsMapper.toDto(entity.getHouseDetails()));
        dto.setFireBoxDto(fireBoxMapper.toDto(entity.getFireBox()));
        return dto;
    }
}
