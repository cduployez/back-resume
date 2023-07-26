package fr.cduployez.backresume.restcontrollers.spring;

import fr.cduployez.backresume.core.data.dtos.ProfileDto;
import fr.cduployez.backresume.core.spring.services.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/profile")
public class ProfileRestController {

    private final ProfileService profileService;

    @GetMapping
    public ProfileDto get() {
        return profileService.get();
    }

}
