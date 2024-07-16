package com.lv.moviestore.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Country {
    @Id
    @Column(name = "country_id", nullable = false)
    Integer countryId;

    @Column(name = "country", nullable = false)
    @NotBlank(message = "country name must not be blank")
    @Size(min = 2, max = 40, message = "country name must be more that 2 symbols and not more then 40")
    String countryName;

    @Column(name = "last_update", nullable = false)
    Timestamp lastUpdate;
}
