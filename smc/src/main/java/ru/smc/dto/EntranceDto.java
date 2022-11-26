package ru.smc.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.smc.model.enums.VPVStatus;

@Data
@NoArgsConstructor
public class EntranceDto {

    private long id;
    private int numberEntrance;
    private int levels;
    private int fireBoxes;
    private int pipes;
    private int fireCranes;
    private VPVStatus attic;
    private VPVStatus basement;
    private VPVStatus work;
    private boolean firstLevel;
    private HouseDetailsDto houseDetailsDto;
    private FireBoxDto fireBoxDto;
}
