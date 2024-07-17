package com.lv.moviestore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @Column(name = "category_id", nullable = false)
    @JsonProperty(value = "id", index = 0)
    Integer categoryId;

    @Column(name = "name", nullable = false)
    @NotBlank(message = "name name must not be blank")
    @Size(min = 2, max = 25, message = "name name must be more that 2 symbols and not more then 25")
    String name;

    @JsonIgnore
    @UpdateTimestamp
    @Column(name = "last_update")
    Timestamp lastUpdate;
}
