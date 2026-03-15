package com.satyanand.lovableclone.service;


import com.satyanand.lovableclone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
