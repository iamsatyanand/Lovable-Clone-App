package com.satyanand.lovableclone.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
