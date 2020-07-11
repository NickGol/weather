package com.weather.weather.model.Models.Weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity // This tells Hibernate to make a table out of this class
public class WeatherCondition {

/*    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "conditions-Sequence")
    @SequenceGenerator(name = "conditions-Sequence", sequenceName = "conditions_id_sequence")*/
    @Id
    @JsonProperty(value = "ID")
    Long id;
    @JsonProperty(value = "Main")
    String main;
    @JsonProperty(value = "Description")
    String description;
    @JsonProperty(value = "Icon")
    String icon;
    @JsonProperty(value = "Day")
    String day;
    @JsonProperty(value = "Night")
    String night;
    @JsonProperty(value = "URL")
    String url;

}
