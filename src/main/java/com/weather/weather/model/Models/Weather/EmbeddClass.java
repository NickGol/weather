package com.weather.weather.model.Models.Weather;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class EmbeddClass {
    @Id
    private Integer param1;
    private Integer param2=2;
    private Integer param3=3;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "qwerty", column = @Column(name = "contact_first_name")),
    })
    EmbeddedClass embeddedClass = new EmbeddedClass();
    public EmbeddClass() {}
    public EmbeddClass(int param) {
        param1 = param;
    }
}

@Embeddable
class EmbeddedClass {
    @Column(name = "qwerty")
    private Integer param3 = 7;
    private Integer param5 = 8;
    private Integer param6 = 9;
}
