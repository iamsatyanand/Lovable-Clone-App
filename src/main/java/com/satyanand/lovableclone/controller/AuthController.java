package com.satyanand.lovableclone.controller;

import com.satyanand.lovableclone.dto.auth.AuthResponse;
import com.satyanand.lovableclone.dto.auth.LoginRequest;
import com.satyanand.lovableclone.dto.auth.SignupRequest;
import com.satyanand.lovableclone.dto.auth.UserProfileResponse;
import com.satyanand.lovableclone.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> register(SignupRequest request){
        return ResponseEntity.status(HttpStatus.OK).body(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest request){
        return ResponseEntity.status(HttpStatus.OK).body(authService.login(request));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile(){
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(authService.getProfile(userId));
    }

}
