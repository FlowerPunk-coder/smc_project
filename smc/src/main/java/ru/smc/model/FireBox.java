package ru.smc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.smc.model.enums.VPVStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "fire_boxes")
public class FireBox {

    @Id
    private long id;
    @Column
    @Enumerated(value = EnumType.STRING)
    private VPVStatus complete;
    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Entrance entrance;
}
