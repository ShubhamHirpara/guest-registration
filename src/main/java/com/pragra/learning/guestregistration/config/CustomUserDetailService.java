package com.pragra.learning.guestregistration.config;

import com.pragra.learning.guestregistration.entity.User;
import com.pragra.learning.guestregistration.repo.GuestRepo;
import com.pragra.learning.guestregistration.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findUserByUsername(username);
        if(user==null){
            throw new UsernameNotFoundException("User not found exception");
        }
        return new CustomUserDetail(user);
    }
}
