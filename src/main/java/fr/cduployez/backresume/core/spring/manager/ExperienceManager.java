package fr.cduployez.backresume.core.spring.manager;

import fr.cduployez.backresume.core.data.dtos.DateRangeDto;
import fr.cduployez.backresume.core.data.dtos.ExperienceDto;
import fr.cduployez.backresume.core.data.dtos.SkillBadgeDto;
import fr.cduployez.backresume.core.data.enums.JobTypeEnum;
import fr.cduployez.backresume.utils.OffsetDateTimeUtils;
import fr.cduployez.backresume.utils.SkillBadgeUtils;
import fr.cduployez.backresume.utils.SkillEnumUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Component
public class ExperienceManager {

    private final Clock clock;

    public List<ExperienceDto> findAll() {
        return Arrays.asList(
                new ExperienceDto(
                        DateRangeDto.monthRange(OffsetDateTimeUtils.fromDate(1, 10, 2022, clock), null),
                        "Worldline",
                        JobTypeEnum.CDI,
                        "Projet Ecobonus",
                        Collections.singletonList("Lead Developer au service d'un projet local et écologique visant à changer les habitudes des automobilistes"),
                        Arrays.asList(
                                SkillBadgeUtils.java,
                                SkillBadgeUtils.springBoot,
                                new SkillBadgeDto("Angular 15", SkillEnumUtils.angularKeyword, SkillEnumUtils.angularChildrenKeywords),
                                SkillBadgeUtils.docker,
                                new SkillBadgeDto("Kubernetes", SkillEnumUtils.kubernetesKeyword, SkillEnumUtils.kubernetesChildrenKeywords),
                                new SkillBadgeDto("Openshift", SkillEnumUtils.openshiftKeyword, SkillEnumUtils.openshiftChildrenKeywords),
                                new SkillBadgeDto("Kafka"),
                                new SkillBadgeDto("Etat d'esprit agile")
                        )
                )
        );
    }
}
