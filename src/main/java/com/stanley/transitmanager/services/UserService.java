package com.stanley.transitmanager.services;

import com.stanley.transitmanager.domain.dtos.user.ReturnUserDto;

import java.util.Optional;

public interface UserService {
    Optional<ReturnUserDto> findOneByEmail(String email);
}
