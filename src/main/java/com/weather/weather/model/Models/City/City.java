package com.weather.weather.model.Models.City;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
@Entity // This tells Hibernate to make a table out of this class
public class City {
    @Id
    @Column(name = "ID", nullable = false)
    //@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "cities-Sequence")
    //@SequenceGenerator(name = "cities-Sequence", sequenceName = "cities_id_sequence")
    Long tableID;

    //@NaturalId
    @JsonProperty(value = "id")
    Long cityID;
    String name;
    String state;
    String country;
    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "coord_id", referencedColumnName = "id")
    //@PrimaryKeyJoinColumn
    @OneToOne(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @MapsId
    Coord coord;
}
