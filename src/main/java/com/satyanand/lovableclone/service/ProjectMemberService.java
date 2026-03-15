package com.satyanand.lovableclone.service;


import com.satyanand.lovableclone.dto.member.InviteMemberRequest;
import com.satyanand.lovableclone.dto.member.MemberResponse;
import com.satyanand.lovableclone.entity.ProjectMember;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
