package com.weather.weather.model.Models.Weather;

import lombok.Data;

import java.util.zip.DeflaterOutputStream;

@Data
public class WeatherEmulator {
    private String city;
    private String weather;
    private Double lon;
    private Double lat;

    public WeatherEmulator(String city, String weather, Double lon, Double lat) {
        this.city = city;
        this.weather = weather;
        this.lon = lon;
        this.lat = lat;
    }
}
