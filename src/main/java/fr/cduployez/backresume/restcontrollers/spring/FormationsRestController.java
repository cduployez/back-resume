package fr.cduployez.backresume.restcontrollers.spring;

import fr.cduployez.backresume.core.data.dtos.FormationDto;
import fr.cduployez.backresume.core.spring.services.FormationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/formations")
public class FormationsRestController {

    private final FormationsService formationsService;

    @GetMapping
    public List<FormationDto> findAll() {
        return formationsService.findAll();
    }

}
