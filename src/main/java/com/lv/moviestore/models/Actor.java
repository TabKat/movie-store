package com.lv.moviestore.models;

import jakarta.persistence.*;
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
    Integer actorId;

    @Column(name = "first_name", nullable = false)
    String firstName;

    @Column(name = "last_name", nullable = false)
    String lastName;

    @Column(name = "last_update")
    Timestamp lastUpdate;
}
