package com.pragra.learning.guestregistration.repo;

import com.pragra.learning.guestregistration.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GuestRepo extends JpaRepository<Guest,Long> {

    Optional<Guest> findById(Long id);
/*
    List<Guest> findAllByLastName(String lastName);

    List<Guest> findAllByFirstAnAndLastName(String firstName, String lastName);
    */

    List<Guest> findByPhone(String phone);

    List<Guest> findByEmail(String email);




}
