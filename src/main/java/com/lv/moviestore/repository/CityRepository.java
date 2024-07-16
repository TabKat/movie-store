package com.lv.moviestore.repository;

import com.lv.moviestore.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    @Query("select c from City c where c.country.countryId = :id")
    List<City> findCityByCountryId(@Param("id") Integer id);
}
