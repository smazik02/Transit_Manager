package com.stanley.transitmanager.domain.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.stanley.transitmanager.domain.enums.OperatingTime;
import com.stanley.transitmanager.domain.enums.TransitType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "lines")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class LineEntity {

    @Id
    private Integer number;

    @Column(name = "transit_type", nullable = false)
    @Enumerated(STRING)
    private TransitType transitType;

    @Column(name = "operating_type", nullable = false)
    @Enumerated(STRING)
    private OperatingTime operatingTime;

    @OneToMany(cascade = ALL, fetch = LAZY, mappedBy = "line")
    @JsonManagedReference
    private List<StopOnLineEntity> stopsOnLine;

}
