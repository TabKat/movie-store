package com.lv.moviestore.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @Column(name = "address_id", nullable = false)
    @JsonProperty(value = "id", index = 0)
    Integer addressId;

    @Column(name = "address", nullable = false)
    @NotBlank(message = "address name must not be blank")
    @Size(min = 2, max = 50, message = "address name must be more that 2 symbols and not more then 50")
    String addressName;

    @Column(name = "address2")
    @Size(min = 2, max = 50, message = "address name must be more that 2 symbols and not more then 50")
    String address2Name;

    @Column(name = "district", nullable = false)
    @NotBlank(message = "district name must not be blank")
    @Size(min = 2, max = 20, message = "district name must be more that 2 symbols and not more then 20")
    String district;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    City city;

    @Column(name = "postal_code", nullable = false)
    @NotBlank(message = "postal code name must not be blank")
    @Size(min = 2, max = 10, message = "postal code name must be more that 2 symbols and not more then 10")
    String postalCode;
}
