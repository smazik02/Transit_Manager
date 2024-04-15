package com.stanley.transitmanager.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Table(name = "rides")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RideEntity {

    @Id
    private long id;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;

    @ManyToOne(cascade = ALL, optional = false)
    @JoinColumn(name = "start_stop_id")
    @JsonBackReference
    private StopEntity startStop;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "end_time")
    private LocalTime endTime;

    @ManyToOne(cascade = ALL)
    @JoinColumn(name = "end_stop_id")
    @JsonBackReference
    private StopEntity endStop;

    @Column(precision = 2)
    private BigDecimal fare;

}
