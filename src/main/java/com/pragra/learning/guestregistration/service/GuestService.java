package com.pragra.learning.guestregistration.service;

import com.pragra.learning.guestregistration.entity.Guest;
import com.pragra.learning.guestregistration.repo.GuestRepo;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

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
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        //if(EmailValidation.patternMatches())
        return guestRepo.save(guest);
    }
    public List<Guest> findAll(){
        return guestRepo.findAll();
    }

}
