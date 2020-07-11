package com.weather.weather.model.Models.City;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown=true)
@Entity
public class Coord {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "cities-Sequence")
    @SequenceGenerator(name = "cities-Sequence", sequenceName = "cities_id_sequence")
    Long id;
    Double lon;
    Double lat;
    @OneToOne(mappedBy = "coord")
    private City user;

}
