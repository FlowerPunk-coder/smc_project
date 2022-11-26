package ru.smc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.smc.dto.HouseDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "houses")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(nullable = false)
    private int number;
    @Column(length = 10)
    private String sing;
    @Column
    private int prefix;
    @Column
    private boolean checked;
    @Column(name = "check_date")
    private LocalDateTime checkDate;
    @ManyToOne
    @JoinColumn(name = "street_id", nullable = false)
    private Street street;
}
