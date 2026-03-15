package com.satyanand.lovableclone.dto.member;


import com.satyanand.lovableclone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
