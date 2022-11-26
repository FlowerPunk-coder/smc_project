package ru.smc.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class TaskDto {

    private long id;
    private String address;
    private LocalDate date;
    private UserDto userDto;
}
