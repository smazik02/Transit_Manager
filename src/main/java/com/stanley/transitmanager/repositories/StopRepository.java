package com.stanley.transitmanager.repositories;

import com.stanley.transitmanager.domain.entities.StopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopRepository extends JpaRepository<StopEntity, Long> {
}
