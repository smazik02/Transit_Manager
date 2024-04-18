package com.stanley.transitmanager.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Table(name = "rides")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class RideEntity {

    @Id
    private Long id;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;

    @Column(
            name = "start_stop_id",
            nullable = false,
            insertable = false,
            updatable = false
    )
    private Long startStopId;

    @ManyToOne(cascade = ALL, optional = false)
    @JoinColumn(name = "start_stop_id")
    @JsonBackReference
    private StopEntity startStop;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "end_stop_id", insertable = false, updatable = false)
    private Long endStopId;

    @ManyToOne(cascade = ALL)
    @JoinColumn(name = "end_stop_id")
    @JsonBackReference
    private StopEntity endStop;

    @Column(precision = 2)
    private BigDecimal fare;

    @Column(name = "user_id", nullable = false, insertable = false, updatable = false)
    private Long userId;

    @ManyToOne(cascade = ALL, optional = false)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private UserEntity user;

}
