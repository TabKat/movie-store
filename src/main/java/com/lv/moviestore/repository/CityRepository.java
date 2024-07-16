package com.lv.moviestore.repository;

import com.lv.moviestore.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
