package com.weather.weather.model.Repositories;

import com.weather.weather.model.Models.City.City;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CitiesRepository extends CrudRepository<City, Long> {

}
