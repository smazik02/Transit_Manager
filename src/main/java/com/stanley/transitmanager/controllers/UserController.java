package com.stanley.transitmanager.controllers;

import com.stanley.transitmanager.domain.dtos.user.ReturnUserDto;
import com.stanley.transitmanager.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(path = "/{email}")
    public ResponseEntity<ReturnUserDto> getUserByEmail(@PathVariable("email") String email) {
        return userService.findOneByEmail(email)
                .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
