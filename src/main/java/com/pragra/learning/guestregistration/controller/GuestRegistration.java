package com.pragra.learning.guestregistration.controller;

import com.pragra.learning.guestregistration.entity.Guest;
import com.pragra.learning.guestregistration.service.EmailService;
import com.pragra.learning.guestregistration.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/guest")
public class GuestRegistration {
    private final GuestService guestService;
    private final EmailService emailService;

    @PostMapping()
    public String addGuest(@RequestBody Guest guest){
        Guest guest1 = null;
        guest1 = guestService.addGuest(guest);
        if(guest1!=null){
            emailService.sendSimpleMessage(guest.getEmail(),guest.getFirstName()+" "+guest.getLastName(),guest.getPurpose());
            return "Guest added sucessfully";
        }
        return "Guest is not added sucessfully";
    }

    @GetMapping("/email")
    public List<Guest> getGuestFromEmail(@RequestParam("email") String email){
        return guestService.findByEmail(email);
    }

    @GetMapping("/phone")
    public List<Guest> getGuestFromPhone(@RequestParam("phone") String phone){
        return guestService.findByPhone(phone);
    }
    @GetMapping
    public List<Guest> getAllGuest(){
        return guestService.findAll();
    }
}
