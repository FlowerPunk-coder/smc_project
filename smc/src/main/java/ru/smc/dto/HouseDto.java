package ru.smc.dto;

import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class HouseDto {

    private long id;
    private int number;
    private String sing;
    private int prefix;
    private boolean checked;
    private LocalDateTime checkDate;
    private StreetDto street;
}
