package ru.smc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.smc.model.enums.VPVStatus;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "entrances")
public class Entrance {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "number_entrance", nullable = false)
    private int numberEntrance;
    @Column(nullable = false)
    private int levels;
    @Column(name = "fire_boxes", nullable = false)
    private int fireBoxes;
    @Column(nullable = false)
    private int pipes;
    @Column(name = "fire_cranes", nullable = false)
    private int fireCranes;
    @Column
    @Enumerated(value = EnumType.STRING)
    private VPVStatus attic;
    @Column
    @Enumerated(value = EnumType.STRING)
    private VPVStatus basement;
    @Column
    @Enumerated(value = EnumType.STRING)
    private VPVStatus work;
    @Column(name = "first_level")
    private boolean firstLevel;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "house_details_id")
    private HouseDetails houseDetails;
    @OneToOne(mappedBy = "entrance", cascade = CascadeType.ALL)
    private FireBox fireBox;
}
