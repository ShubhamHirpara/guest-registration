package com.pragra.learning.guestregistration.repo;

import com.pragra.learning.guestregistration.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepo extends JpaRepository<Guest,Long> {

    List<Guest> findGuestById(Long id);

    List<Guest> findAllByLastName(String lastName);

    List<Guest> findALlByFirstAnAndLastName(String firstName, String lastName);




}
