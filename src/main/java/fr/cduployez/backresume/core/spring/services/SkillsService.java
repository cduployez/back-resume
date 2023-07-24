package fr.cduployez.backresume.core.spring.services;

import fr.cduployez.backresume.core.data.dtos.SkillGroupDto;
import fr.cduployez.backresume.core.exceptions.UnmappableDtoException;
import fr.cduployez.backresume.core.spring.managers.SkillGroupManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SkillsService {

    private final SkillGroupManager skillGroupManager;

    public List<SkillGroupDto> findGroups() throws UnmappableDtoException {
        return List.of(
                skillGroupManager.findLanguageAndFrameworkGroup(),
                skillGroupManager.findWebGroup(),
                skillGroupManager.findOtherGroup()
        );
    }
}
