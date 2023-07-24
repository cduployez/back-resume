package fr.cduployez.backresume.restcontrollers.spring;

import fr.cduployez.backresume.core.data.dtos.ProjectDto;
import fr.cduployez.backresume.core.spring.service.ProjectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/projects")
public class ProjectsRestController {

    private final ProjectsService projectsService;

    @GetMapping
    public List<ProjectDto> findAll() {
        return projectsService.findAll();
    }

}
