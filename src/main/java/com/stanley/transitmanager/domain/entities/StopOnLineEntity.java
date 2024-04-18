package com.stanley.transitmanager.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "stops_on_lines")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StopOnLineEntity {

    @Id
    private Long id;

    @Column(name = "stop_number", nullable = false)
    private Integer stopNumber;

    @Column(name = "line_number", nullable = false, insertable = false, updatable = false)
    private Integer lineNumber;

    @ManyToOne(cascade = ALL, optional = false)
    @JoinColumn(name = "line_number")
    @JsonBackReference
    private LineEntity line;

    @Column(name = "stop_id", nullable = false, insertable = false, updatable = false)
    private Long stopId;

    @ManyToOne(cascade = ALL, optional = false)
    @JoinColumn(name = "stop_id")
    @JsonBackReference
    private StopEntity stop;

    @OneToMany(cascade = ALL, fetch = LAZY, mappedBy = "lineStop")
    @JsonManagedReference
    private List<ArrivalEntity> arrivals;

}
