package com.pragra.learning.guestregistration.service;

import com.pragra.learning.guestregistration.entity.Guest;
import com.pragra.learning.guestregistration.repo.GuestRepo;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@Builder
@RequiredArgsConstructor
public class GuestService {
    private final GuestRepo guestRepo;

    public Optional<Guest> findGuestByid(Long id){
        return guestRepo.findById(id);
    }

    public List<Guest> findByPhone(String phone) {

        return guestRepo.findByPhone(phone);
    }

    public List<Guest> findByEmail(String email){
        return guestRepo.findByEmail(email);
    }

    public Guest addGuest(Guest guest){
        return guestRepo.save(guest);
    }

    public List<Guest> fetchGuestList() {

        return guestRepo.findAll();

    }

    public void deleteGuestById(Long id){

        guestRepo.deleteById(id);
    }


}
