package fr.cduployez.backresume.restcontrollers.spring;

import fr.cduployez.backresume.core.data.dtos.SkillGroupDto;
import fr.cduployez.backresume.core.exceptions.UnmappableDtoException;
import fr.cduployez.backresume.core.spring.services.SkillsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/skills")
public class SkillsRestController {

    private final SkillsService skillsService;

    @GetMapping
    public List<SkillGroupDto> findGroups() throws UnmappableDtoException {
        return skillsService.findGroups();
    }

}
