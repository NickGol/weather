package com.weather.weather.model.Models.Weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@SequenceGenerator(
        name = "weather_json_sequence_generator",
        sequenceName = "weather_sequence"
)
@SequenceGenerator(
        name = "weather_sequence_generator",
        sequenceName = "weather_sequence"
)

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown=true)
@Entity//(name = "qwerty")
public class WeatherJSON {

/*    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "weather_json_sequence_generator"
    )*/
@Id
    private Long rowID = 1L;

    @Embedded
    @JsonProperty("coord")
    private Coordinates coordinates;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Weather> weather;
    private String base;
    @Embedded
    private Main main;
    private Long visibility;
    @Embedded
    private Wind wind;
    @Embedded
    private Clouds clouds;
    @Embedded
    private Rain rain;
    @Embedded
    private Snow snow;
    private Integer dt;
    @JsonProperty("sys")
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "id", column = @Column(name = "sys_id")),
    })
    private System system;
    private Long timezone;
    private Long id;
    private String name;
    private Long cod;
    public Integer getWeatherID() {
        return weather.get(0).getId();
    }

}

@Data
@Embeddable
class Coordinates {

    private Double lon;
    private Double lat;
}

@Getter @Setter
@Entity
class Weather {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "weather_sequence_generator"
    )
    private Long rowID;
    private Integer id;
    private String main;
    private String description;
    private String icon;
}

@Getter @Setter
@Embeddable
class Main {
    @JsonProperty("temp")
    private Float temperature;
    @JsonProperty("feels_like")
    private Float feelsLike;
    private Float pressure;
    private Float humidity;
    @JsonProperty("temp_min")
    private Float temperatureMin;
    @JsonProperty("temp_max")
    private Float temperatureMax;
    @JsonProperty("sea_level")
    private Float seaLevel;
    @JsonProperty("grnd_level")
    private Float groundLevel;
}

@Getter @Setter
@Embeddable
class Wind {

    private Float speed;
    @JsonProperty("deg")
    private Float degree;
}

@Getter @Setter
@Embeddable
class Clouds {
    @JsonProperty("all")
    private Integer allClouds;
}

@Getter @Setter
@Embeddable
class Rain {

    private Integer rainOneHour;
    private Integer rainThreeHours;
}

@Getter @Setter
@Embeddable
class Snow {

    private Integer snowOneHour;
    private Integer snowThreeHours;
}


@Getter @Setter
@Embeddable
class System {

    private Integer type;
    private Long id;
    private Float message;
    private String country;
    private Long sunrise;
    private Long sunset;
}
