package com.lv.moviestore.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class City {
    @Id
    @Column(name = "city_id", nullable = false)
    Integer cityId;

    @Column(name = "city", nullable = false)
    @NotBlank(message = "city name must not be blank")
    @Size(min = 2, max = 100, message = "city name must be more that 2 symbols and not more then 100")
    String cityName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    Country countryId;

    @Column(name = "last_update", nullable = false)
    Timestamp lastUpdate;
}
