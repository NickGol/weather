package com.weather.weather.model.Repositories;

import com.weather.weather.model.Models.Weather.WeatherCondition;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ConditionsRepository extends CrudRepository<WeatherCondition, Long> {

}
