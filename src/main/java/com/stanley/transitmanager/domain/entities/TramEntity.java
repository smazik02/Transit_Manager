package com.stanley.transitmanager.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "trams")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TramEntity extends VehicleEntity {
}
