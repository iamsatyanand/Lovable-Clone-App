package com.satyanand.lovableclone.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
