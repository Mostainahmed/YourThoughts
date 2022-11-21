package com.mostain.syed.ahmed.yourthoughts.controller;

import com.mostain.syed.ahmed.yourthoughts.dto.RegisterRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/signup")
    public void signup(@RequestBody RegisterRequestDTO registerRequestDto){

    }
}
