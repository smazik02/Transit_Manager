package com.stanley.transitmanager.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static jakarta.persistence.InheritanceType.JOINED;

@Entity
@Inheritance(strategy = JOINED)
@Table(name = "vehicles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VehicleEntity {

    @Id
    private long id;

    private String make;

    private String model;

    private int passengerCount;

}
