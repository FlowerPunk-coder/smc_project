package ru.smc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "house_details")
public class HouseDetails {

    @Id
    private long id;
    @Column(nullable = false)
    private int systems;
    @Column(nullable = false)
    private int entrances;
    @Column(nullable = false)
    private int levels;
    @Column
    private boolean multilevel;
    @Column
    private String comment;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id")
    private House house;
    @OneToMany(mappedBy = "houseDetails", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Entrance> entrancesList;
}
