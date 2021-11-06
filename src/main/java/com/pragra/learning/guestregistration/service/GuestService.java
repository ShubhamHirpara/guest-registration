package com.pragra.learning.guestregistration.service;

import com.pragra.learning.guestregistration.entity.Guest;
import com.pragra.learning.guestregistration.repo.GuestRepo;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Builder
@RequiredArgsConstructor
public class GuestService {
    private final GuestRepo guestRepo;

    public List<Guest> findGuestByid(Long id){
        return guestRepo.findGuestById(id);
    }

    public List<Guest> findGuestByLastName(String lastName){
        return guestRepo.findAllByLastName("lastname");
    }
    public List<Guest> findGuestByFirstAndLastName(String firstName, String lastName){
        return guestRepo.findALlByFirstAnAndLastName("firstName", "lastName");
    }
    public Guest addGuest(Guest guest){
        return guestRepo.save(guest);
    }

}
