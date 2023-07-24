package fr.cduployez.backresume.core.spring.managers;

import fr.cduployez.backresume.core.data.dtos.SkillGroupDto;
import fr.cduployez.backresume.core.exceptions.UnmappableDtoException;
import fr.cduployez.backresume.core.mappers.SkillDtoMapper;
import fr.cduployez.backresume.utils.SkillBadgeUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class SkillGroupManager {

    public SkillGroupDto findLanguageAndFrameworkGroup() throws UnmappableDtoException {
        return new SkillGroupDto("Langages & Frameworks",
                SkillDtoMapper.toSkillDtos(List.of(SkillBadgeUtils.java(),
                        SkillBadgeUtils.springBoot(),
                        SkillBadgeUtils.cPlusPlus(),
                        SkillBadgeUtils.cSharp(),
                        SkillBadgeUtils.python(),
                        SkillBadgeUtils.android(null))));
    }

    public SkillGroupDto findWebGroup() throws UnmappableDtoException {
        return new SkillGroupDto("Web",
                SkillDtoMapper.toSkillDtos(List.of(SkillBadgeUtils.angular(null),
                        SkillBadgeUtils.html(),
                        SkillBadgeUtils.css(),
                        SkillBadgeUtils.javaScript(),
                        SkillBadgeUtils.typeScript())));
    }

    public SkillGroupDto findOtherGroup() throws UnmappableDtoException {
        return new SkillGroupDto("Divers",
                SkillDtoMapper.toSkillDtos(List.of(
                        // CI/CD
                        SkillBadgeUtils.gitlabCi(),
                        // Run
                        SkillBadgeUtils.docker(),
                        SkillBadgeUtils.kubernetes(),
                        // Authentication
                        SkillBadgeUtils.keycloak(),
                        // Databases
                        SkillBadgeUtils.mySql(),
                        SkillBadgeUtils.mongoDb()
                )));
    }

}
