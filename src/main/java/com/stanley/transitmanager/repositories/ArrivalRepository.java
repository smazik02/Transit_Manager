package com.stanley.transitmanager.repositories;

import com.stanley.transitmanager.domain.entities.ArrivalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArrivalRepository extends JpaRepository<ArrivalEntity, Long> {
}
