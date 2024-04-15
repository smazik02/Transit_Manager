package com.stanley.transitmanager.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "stops_on_lines")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString()
public class StopOnLineEntity {

    @Id
    private long id;

    @Column(name = "stop_number", nullable = false)
    private int stopNumber;

    @ManyToOne(cascade = ALL, optional = false)
    @JoinColumn(name = "line_number")
    @JsonBackReference
    private LineEntity line;

    @ManyToOne(cascade = ALL, optional = false)
    @JoinColumn(name = "stop_id")
    @JsonBackReference
    private StopEntity stop;

    @OneToMany(cascade = ALL, fetch = LAZY, mappedBy = "lineStop")
    private List<ArrivalEntity> arrivals;

}
