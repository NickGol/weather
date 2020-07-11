package com.weather.weather.model.Models.Weather;

import lombok.Getter;

@Getter
public class WeatherData {
    private Double coordinateLat;
    private Double coordinateLon;
    private String cityName;
    private Integer weatherID;
    private String weatherDescription;
    private Integer currentTemperature;
    private Integer minTemperature;
    private Integer maxTemperature;
    private Integer feelsLikeTemperature;
    private Integer humidity;
    private String iconAddress;

    public WeatherData(WeatherJSON weatherJSON, WeatherCondition weatherCondition) {

        coordinateLat = weatherJSON.getCoordinates().getLat();
        coordinateLon = weatherJSON.getCoordinates().getLon();
        cityName = weatherJSON.getName();
        weatherID = weatherJSON.getWeather().get(0).getId();
        weatherDescription = weatherJSON.getWeather().get(0).getDescription();
        currentTemperature = weatherJSON.getMain().getTemperature().intValue();
        minTemperature = weatherJSON.getMain().getTemperatureMin().intValue();
        maxTemperature = weatherJSON.getMain().getTemperatureMax().intValue();
        feelsLikeTemperature = weatherJSON.getMain().getFeelsLike().intValue();
        humidity = weatherJSON.getMain().getHumidity().intValue();
        iconAddress = weatherJSON.getWeather().get(0).getIcon().endsWith("d") ? weatherCondition.getUrl() + weatherCondition.getDay().toLowerCase() : weatherCondition.getUrl() + weatherCondition.getNight().toLowerCase();
    }
}
