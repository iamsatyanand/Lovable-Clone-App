package com.satyanand.lovableclone.service;


import com.satyanand.lovableclone.dto.project.ProjectRequest;
import com.satyanand.lovableclone.dto.project.ProjectResponse;
import com.satyanand.lovableclone.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
