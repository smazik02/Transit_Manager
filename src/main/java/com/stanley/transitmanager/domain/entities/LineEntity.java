package com.stanley.transitmanager.domain.entities;

import com.stanley.transitmanager.domain.enums.OperatingTime;
import com.stanley.transitmanager.domain.enums.TransitType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "lines")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LineEntity {

    @Id
    private long number;

    private TransitType transitType;

    private OperatingTime operatingTime;

}
