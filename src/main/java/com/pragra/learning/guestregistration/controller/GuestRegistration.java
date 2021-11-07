package com.pragra.learning.guestregistration.controller;

import com.pragra.learning.guestregistration.entity.Guest;
import com.pragra.learning.guestregistration.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/guest")
public class GuestRegistration {
    private final GuestService guestService;

    @PostMapping("/add")
    public String addGuest(@RequestBody Guest guest){
        Guest guest1 = null;
        guest1 = guestService.addGuest(guest);
        if(guest1!=null){
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

    //return all the guests in the database
    @GetMapping("/guestAll")
    public List<Guest> fetchGuestList(){

        return guestService.fetchGuestList();

    }
}
