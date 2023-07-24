package fr.cduployez.backresume.restcontrollers.spring;

import fr.cduployez.backresume.core.data.dtos.HobbyDto;
import fr.cduployez.backresume.core.spring.services.HobbiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hobbies")
public class HobbiesRestController {

    private final HobbiesService hobbiesService;

    @GetMapping
    public List<HobbyDto> findAll() {
        return hobbiesService.findAll();
    }

}
