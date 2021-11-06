package com.pragra.learning.guestregistration;

import com.pragra.learning.guestregistration.service.EmailService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GuestRegistrationApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private EmailService emailService;

    @Test
    public void testEmail() {
        emailService.sendMail("shubhamhirpara61@gmail.com", "Test subject", "Test mail");
    }
}
