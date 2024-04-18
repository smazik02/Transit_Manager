package com.stanley.transitmanager.mappers;

import com.stanley.transitmanager.domain.dtos.user.ReturnUserDto;
import com.stanley.transitmanager.domain.entities.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {

    public ReturnUserDto mapTo(UserEntity userEntity) {
        return new ReturnUserDto(
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getEmail(),
                userEntity.getAccountBalance()
        );
    }

}
