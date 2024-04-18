package com.stanley.transitmanager.repositories;

import com.stanley.transitmanager.domain.entities.StopOnLineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopOnLineRepository extends JpaRepository<StopOnLineEntity, Long> {
}
