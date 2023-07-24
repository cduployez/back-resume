package fr.cduployez.backresume.restcontrollers.spring;

import fr.cduployez.backresume.core.data.dtos.ExperienceDto;
import fr.cduployez.backresume.core.spring.services.ExperiencesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/experiences")
public class ExperiencesRestController {

    private final ExperiencesService experiencesService;

    @GetMapping
    public List<ExperienceDto> findAll() {
        return experiencesService.findAll();
    }

}
