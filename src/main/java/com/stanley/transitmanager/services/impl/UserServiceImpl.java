package com.stanley.transitmanager.services.impl;

import com.stanley.transitmanager.domain.dtos.user.ReturnUserDto;
import com.stanley.transitmanager.mappers.UserMapper;
import com.stanley.transitmanager.repositories.UserRepository;
import com.stanley.transitmanager.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public Optional<ReturnUserDto> findOneByEmail(String email) {
        return userRepository.findOneByEmail(email).map(userMapper::mapTo);
    }

}
