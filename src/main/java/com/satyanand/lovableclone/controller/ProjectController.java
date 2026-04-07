package com.satyanand.lovableclone.controller;

import com.satyanand.lovableclone.dto.project.ProjectRequest;
import com.satyanand.lovableclone.dto.project.ProjectResponse;
import com.satyanand.lovableclone.dto.project.ProjectSummaryResponse;
import com.satyanand.lovableclone.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private ProjectService projectService;

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest request){
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request, userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id){
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.OK).body(projectService.getUserProjectById(id, userId));
    }

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects() {
        Long userId = 1L; //TODO: update later with real Spring Security
        return ResponseEntity.ok(projectService.getUserProjects(userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id, @RequestBody ProjectRequest request) {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.updateProject(id, request, userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        Long userId = 1L;
        projectService.softDelete(id, userId);
        return ResponseEntity.noContent().build();
    }
}
