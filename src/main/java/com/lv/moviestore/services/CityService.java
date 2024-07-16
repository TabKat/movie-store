package com.lv.moviestore.services;

import com.lv.moviestore.models.City;
import com.lv.moviestore.repository.CityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CityService {
    CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    /**
     * Get all cities
     *
     * @return the list of cities
     */
    public List<City> getCities() {
        log.info("find all cities");
        return cityRepository.findAll();
    }

    /**
     * Get all cities by country id
     *
     * @param id Long
     * @return the list of cities
     */
    public List<City> getCitiesByCountryId(Integer id) {
        log.info("find all cities where country id is {}", id);
        return cityRepository.findCityByCountryId(id);
    }
}
