package ru.smc.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HouseDetailsDto {

    private long id;
    private int systems;
    private int entrances;
    private int levels;
    private boolean multilevel;
    private String comment;
    private HouseDto house;
}
