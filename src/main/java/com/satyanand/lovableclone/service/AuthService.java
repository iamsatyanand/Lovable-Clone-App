package com.satyanand.lovableclone.service;


import com.satyanand.lovableclone.dto.auth.AuthResponse;
import com.satyanand.lovableclone.dto.auth.LoginRequest;
import com.satyanand.lovableclone.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
