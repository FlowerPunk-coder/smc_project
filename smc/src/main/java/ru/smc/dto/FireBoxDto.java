package ru.smc.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.smc.model.enums.VPVStatus;

@Data
@NoArgsConstructor
public class FireBoxDto {

    private long id;
    private VPVStatus complete;
    private EntranceDto entrance;
}
