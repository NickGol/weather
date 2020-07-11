package com.weather.weather.model.Service;

import com.weather.weather.model.Models.City.City;
import com.weather.weather.model.Repositories.CitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@Repository
@Transactional
public class CitiesService implements CitiesServiceInterface {

    @Autowired
    private CitiesRepository citiesRepository;

    public Optional<City> findById(Long id) {
        return citiesRepository.findById(id);
    }

}
