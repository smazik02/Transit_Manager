package com.stanley.transitmanager.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.stanley.transitmanager.domain.enums.OperatingDays;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.EnumType.STRING;

@Entity
@Table(name = "arrivals")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ArrivalEntity {

    @Id
    private Long id;

    @Column(name = "arrival_time", nullable = false)
    private LocalTime arrivalTime;

    @Column(name = "operating_day", nullable = false)
    @Enumerated(STRING)
    private OperatingDays operatingDay;

    @Column(name = "line_stop", nullable = false, updatable = false, insertable = false)
    private Integer lineStopId;

    @ManyToOne(cascade = ALL, optional = false)
    @JoinColumn(name = "line_stop")
    @JsonBackReference
    private StopOnLineEntity lineStop;

}
