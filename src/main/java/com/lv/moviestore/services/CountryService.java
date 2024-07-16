package com.lv.moviestore.services;

import com.lv.moviestore.models.Country;
import com.lv.moviestore.repository.CountryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CountryService {
    CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    /**
     * Get all countries
     *
     * @return the list of countries
     */
    public List<Country> getCountries() {
        log.info("find all countries");
        return countryRepository.findAll();
    }
}
