package ru.smc.dto;

import lombok.Data;

@Data
public class StreetDto {

    private long id;
    private String name;
    private DistrictDto district;
}
