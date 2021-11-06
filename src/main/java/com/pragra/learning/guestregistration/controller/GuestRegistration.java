package com.pragra.learning.guestregistration.controller;

import com.pragra.learning.guestregistration.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GuestRegistration {
    private final GuestService guestService;
}
