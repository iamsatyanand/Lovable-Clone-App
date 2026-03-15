package com.satyanand.lovableclone.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
