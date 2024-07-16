package com.lv.moviestore.controllers;

import com.lv.moviestore.models.City;
import com.lv.moviestore.services.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping("/api/v1/cities")
public class CityController {
    CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    List<City> getCities() {
        return cityService.getCities();
    }

    @GetMapping("/{id}")
    List<City> getCitiesByCountryId(@PathVariable("id") Integer id) {
        return cityService.getCitiesByCountryId(id);
    }
}
