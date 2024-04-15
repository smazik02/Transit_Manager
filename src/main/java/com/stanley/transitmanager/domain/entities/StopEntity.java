package com.stanley.transitmanager.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "stops")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StopEntity {

    @Id
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

}
