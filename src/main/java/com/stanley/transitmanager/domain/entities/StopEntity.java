package com.stanley.transitmanager.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "stops")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StopEntity {

    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(cascade = ALL, fetch = LAZY, mappedBy = "stop")
    private List<StopOnLineEntity> stopsOnLines;

}
