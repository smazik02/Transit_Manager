package com.stanley.transitmanager.domain.dtos.user;

import java.math.BigDecimal;

public record ReturnUserDto(
        String firstName,
        String lastName,
        String email,
        BigDecimal accountBalance
) {
}
