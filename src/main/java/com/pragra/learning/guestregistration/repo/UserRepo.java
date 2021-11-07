package com.pragra.learning.guestregistration.repo;

import com.pragra.learning.guestregistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User findUserByUsername(String username);
}
