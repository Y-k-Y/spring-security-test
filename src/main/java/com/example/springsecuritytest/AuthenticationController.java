package com.example.springsecuritytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/join")
    public String join() {
        return "join";
    }
}
