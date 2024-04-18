package com.stanley.transitmanager.repositories;

import com.stanley.transitmanager.domain.entities.LineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineRepository extends JpaRepository<LineEntity, Integer> {
}
