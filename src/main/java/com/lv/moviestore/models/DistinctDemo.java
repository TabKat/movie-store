package com.lv.moviestore.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DistinctDemo {
    @Id
    @Column(name = "id")
    @JsonProperty(value = "id", index = 0)
    Integer id;

    @Column(name = "bcolor")
    String bcolor;

    @Column(name = "fcolor")
    String fcolor;
}
