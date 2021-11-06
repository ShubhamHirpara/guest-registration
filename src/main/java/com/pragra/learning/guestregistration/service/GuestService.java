package com.pragra.learning.guestregistration.service;

import com.pragra.learning.guestregistration.repo.GuestRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class GuestService {
    private final GuestRepo guestRepo;
}
