package com.pragra.learning.guestregistration.repo;

import com.pragra.learning.guestregistration.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepo extends JpaRepository<Guest,Long> {
}
