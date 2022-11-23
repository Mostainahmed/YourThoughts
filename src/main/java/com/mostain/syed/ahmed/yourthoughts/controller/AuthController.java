package com.mostain.syed.ahmed.yourthoughts.controller;

import com.mostain.syed.ahmed.yourthoughts.dto.RegisterRequestDTO;
import com.mostain.syed.ahmed.yourthoughts.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequestDTO registerRequestDto){
        authService.signup(registerRequestDto);
        return new ResponseEntity<>("User Registration Successful",
                HttpStatus.OK);
    }
    @GetMapping("accountVerification/{token}")
    public ResponseEntity<String> verifyAccount(@PathVariable String token){
        authService.verifyAccount(token);
        return new ResponseEntity<>("User Activation Successful",
                HttpStatus.OK);
    }
}
