package fr.cduployez.backresume.core.spring.services;

import fr.cduployez.backresume.core.data.dtos.ProjectDto;
import fr.cduployez.backresume.core.spring.managers.ProjectManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectsService {

    private final ProjectManager projectManager;

    public List<ProjectDto> findAll() {
        return projectManager.findAll();
    }
}
