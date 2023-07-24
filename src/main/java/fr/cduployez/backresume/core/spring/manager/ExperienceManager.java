package fr.cduployez.backresume.core.spring.manager;

import fr.cduployez.backresume.core.data.dtos.DateRangeDto;
import fr.cduployez.backresume.core.data.dtos.ExperienceDto;
import fr.cduployez.backresume.core.data.enums.JobTypeEnum;
import fr.cduployez.backresume.utils.OffsetDateTimeUtils;
import fr.cduployez.backresume.utils.SkillBadgeUtils;
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
        return List.of(
                new ExperienceDto(
                        DateRangeDto.monthRange(OffsetDateTimeUtils.fromDate(1, 10, 2022, clock), null),
                        "Worldline",
                        JobTypeEnum.CDI,
                        "Projet Ecobonus",
                        Collections.singletonList("Lead Developer au service d'un projet local et écologique visant à changer les habitudes des automobilistes"),
                        Arrays.asList(
                                SkillBadgeUtils.java(),
                                SkillBadgeUtils.springBoot(),
                                SkillBadgeUtils.angular(15),
                                SkillBadgeUtils.docker(),
                                SkillBadgeUtils.kubernetes(),
                                SkillBadgeUtils.openshift(),
                                SkillBadgeUtils.kafka(),
                                SkillBadgeUtils.agile()
                        )
                ),
                new ExperienceDto(
                        DateRangeDto.monthRange(
                                OffsetDateTimeUtils.fromDate(1, 7, 2021, clock),
                                OffsetDateTimeUtils.fromDate(30, 9, 2022, clock)
                        ),
                        "Worldline",
                        JobTypeEnum.CDI,
                        "Projet Maela",
                        List.of("Lead Developer au sein d'une équipe internationale en méthode agile, développement d'une solution de télésuivi médical pour professionnels de santé et patients"),
                        List.of(
                                SkillBadgeUtils.java(),
                                SkillBadgeUtils.springBoot(),
                                SkillBadgeUtils.angular(11),
                                SkillBadgeUtils.mySql(),
                                SkillBadgeUtils.docker(),
                                SkillBadgeUtils.kubernetes(),
                                SkillBadgeUtils.azure(),
                                SkillBadgeUtils.agile(),
                                SkillBadgeUtils.english()
                        )
                ),
                new ExperienceDto(
                        DateRangeDto.monthRange(
                                OffsetDateTimeUtils.fromDate(1, 1, 2021, clock),
                                OffsetDateTimeUtils.fromDate(30, 6, 2021, clock)
                        ),
                        "Worldline",
                        JobTypeEnum.CDI,
                        "Projet Dossier Médical Partagé",
                        List.of("Interconnexion du Dossier Médical Partagé avec l'Espace Numérique de Santé"),
                        List.of(
                                SkillBadgeUtils.java(),
                                SkillBadgeUtils.springBoot(),
                                SkillBadgeUtils.apacheTapestry()
                        )
                ),
                new ExperienceDto(
                        DateRangeDto.monthRange(
                                OffsetDateTimeUtils.fromDate(1, 1, 2018, clock),
                                OffsetDateTimeUtils.fromDate(31, 12, 2020, clock)
                        ),
                        "Worldline",
                        JobTypeEnum.CDI,
                        "Projet SI-VIC",
                        List.of(
                                "Lead Developer au sein d'une équipe en méthode agile, développement d'une solution d'aide aux victimes en cas d'événements majeurs sur le territoire Français",
                                "Gestion et amélioration pendant la crise Covid-19 : dénombrement quotidien, suivi et analyse des parcours de soins des patients dans les hôpitaux"
                        ),
                        List.of(
                                SkillBadgeUtils.java(),
                                SkillBadgeUtils.spring(5),
                                SkillBadgeUtils.keycloak(),
                                SkillBadgeUtils.angular(8),
                                SkillBadgeUtils.mySql(),
                                SkillBadgeUtils.agile()
                        )
                ),
                new ExperienceDto(
                        DateRangeDto.monthRange(
                                OffsetDateTimeUtils.fromDate(1, 9, 2017, clock),
                                OffsetDateTimeUtils.fromDate(31, 12, 2017, clock)
                        ),
                        "Worldline",
                        JobTypeEnum.CDI,
                        "Projet Télépaiement",
                        List.of("Mise en place du télépaiement des forfaits de post-stationnement"),
                        List.of(
                                SkillBadgeUtils.java(),
                                SkillBadgeUtils.javaEe(),
                                SkillBadgeUtils.web(),
                                SkillBadgeUtils.mySql()
                        )
                ),
                new ExperienceDto(
                        DateRangeDto.monthRange(
                                OffsetDateTimeUtils.fromDate(1, 9, 2016, clock),
                                OffsetDateTimeUtils.fromDate(31, 8, 2017, clock)
                        ),
                        "Worldline",
                        JobTypeEnum.ALTERNANCE,
                        "Projets Datadock, Saveurs & Vie ; Sujets de R&D",
                        List.of("Assistant développeur sur différents projets de dématérialisation"),
                        List.of(
                                SkillBadgeUtils.java(),
                                SkillBadgeUtils.springBoot(),
                                SkillBadgeUtils.keycloak(),
                                SkillBadgeUtils.angular(2),
                                SkillBadgeUtils.ionic(2),
                                SkillBadgeUtils.mongoDb(),
                                SkillBadgeUtils.docker()
                        )
                ),
                new ExperienceDto(
                        DateRangeDto.monthRange(
                                OffsetDateTimeUtils.fromDate(1, 5, 2016, clock),
                                OffsetDateTimeUtils.fromDate(31, 7, 2016, clock)
                        ),
                        "Intelligent Solutions",
                        JobTypeEnum.STAGE,
                        "Projet IMail",
                        List.of("Développement de modules et optimisation pour la solution d'emailing professionnel IMAIL"),
                        List.of(
                                SkillBadgeUtils.cSharp(),
                                SkillBadgeUtils.mvcNet(),
                                SkillBadgeUtils.web(),
                                SkillBadgeUtils.mySql()
                        )
                )
        );
    }
}
