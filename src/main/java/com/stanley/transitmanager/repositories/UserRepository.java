package com.stanley.transitmanager.repositories;

import com.stanley.transitmanager.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findOneByEmail(String email);
}
