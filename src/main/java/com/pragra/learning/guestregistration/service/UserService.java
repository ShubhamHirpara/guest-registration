package com.pragra.learning.guestregistration.service;

import com.pragra.learning.guestregistration.entity.User;
import com.pragra.learning.guestregistration.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo repo;

    public User addUser(User user){
        return repo.save(user);
    }

}
