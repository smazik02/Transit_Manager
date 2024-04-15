package com.stanley.transitmanager.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.stanley.transitmanager.domain.enums.OperatingDays;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalTime;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.EnumType.STRING;

@Entity
@Table(name = "arrivals")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString()
public class ArrivalEntity {

    @Id
    private long id;

    @Column(name = "arrival_time", nullable = false)
    private LocalTime arrivalTime;

    @Column(name = "operating_day", nullable = false)
    @Enumerated(STRING)
    private OperatingDays operatingDay;

    @ManyToOne(cascade = ALL, optional = false)
    @JoinColumn(name = "line_stop")
    @JsonBackReference
    private StopOnLineEntity lineStop;

}
