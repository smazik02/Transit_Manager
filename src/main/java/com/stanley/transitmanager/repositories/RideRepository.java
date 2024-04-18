package com.stanley.transitmanager.repositories;

import com.stanley.transitmanager.domain.entities.RideEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<RideEntity, Long> {
}
