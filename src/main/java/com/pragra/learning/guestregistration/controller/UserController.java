package com.pragra.learning.guestregistration.controller;

import com.pragra.learning.guestregistration.entity.User;
import com.pragra.learning.guestregistration.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping()
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
