package com.weather.weather.model.Repositories;

import com.weather.weather.model.Models.City.City;
import com.weather.weather.model.Models.Weather.WeatherJSON;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface WeatherJSONRepository extends CrudRepository<WeatherJSON, Long> {

}
