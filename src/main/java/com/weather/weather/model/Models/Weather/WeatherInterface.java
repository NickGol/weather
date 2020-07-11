package com.weather.weather.model.Models.Weather;

public interface WeatherInterface {

    public Double getCoordinateLat();
    public Double getCoordinateLon();
    public String getCityName();
    public Integer getWeatherID();
    public String getWeatherDescription();
    public Float getTemperature();
    public Float getMinTemperature();
    public Float getMaxTemperature();
    public Float getHumidity();
}
