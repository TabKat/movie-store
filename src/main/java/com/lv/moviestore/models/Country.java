package com.lv.moviestore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty(value = "id", index = 0)
    Integer countryId;

    @Column(name = "country", nullable = false)
    @NotBlank(message = "country name must not be blank")
    @Size(min = 2, max = 50, message = "country name must be more that 2 symbols and not more then 50")
    String countryName;

    @JsonIgnore
    @Column(name = "last_update", nullable = false)
    Timestamp lastUpdate;
}
