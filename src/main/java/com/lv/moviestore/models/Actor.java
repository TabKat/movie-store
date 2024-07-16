package com.lv.moviestore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Actor {
    @Id
    @Column(name = "actor_id", nullable = false)
    @JsonProperty(value = "id", index = 0)
    Integer actorId;

    @Column(name = "first_name", nullable = false)
    @NotBlank(message = "first name must not be blank")
    @Size(min = 2, max = 45, message = "first name must be more that 2 symbols and not more then 45")
    String firstName;

    @Column(name = "last_name", nullable = false)
    @NotBlank(message = "last name must not be blank")
    @Size(min = 2, max = 45, message = "last name must be more that 2 symbols and not more then 45")
    String lastName;

    @JsonIgnore
    @Column(name = "last_update", nullable = false)
    Timestamp lastUpdate;
}
