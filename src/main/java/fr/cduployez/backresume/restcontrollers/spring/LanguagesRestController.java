package fr.cduployez.backresume.restcontrollers.spring;

import fr.cduployez.backresume.core.data.dtos.LanguageDto;
import fr.cduployez.backresume.core.spring.service.LanguagesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/languages")
public class LanguagesRestController {

    private final LanguagesService languagesService;

    @GetMapping
    public List<LanguageDto> findAll() {
        return languagesService.findAll();
    }

}
