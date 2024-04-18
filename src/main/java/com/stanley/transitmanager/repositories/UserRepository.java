package com.stanley.transitmanager.repositories;

import com.stanley.transitmanager.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
