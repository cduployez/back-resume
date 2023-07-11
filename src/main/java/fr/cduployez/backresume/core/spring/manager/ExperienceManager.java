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
        return List.of(
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
                                SkillBadgeUtils.java,
                                SkillBadgeUtils.springBoot,
                                new SkillBadgeDto(
                                        "Angular 11",
                                        SkillEnumUtils.angularKeyword,
                                        SkillEnumUtils.angularChildrenKeywords
                                ),
                                new SkillBadgeDto("MySQL", SkillEnumUtils.mySqlKeyword),
                                SkillBadgeUtils.docker,
                                new SkillBadgeDto(
                                        "Kubernetes",
                                        SkillEnumUtils.kubernetesKeyword,
                                        SkillEnumUtils.kubernetesChildrenKeywords
                                ),
                                new SkillBadgeDto(
                                        "Azure",
                                        SkillEnumUtils.azureKeyword,
                                        SkillEnumUtils.azureChildrenKeywords
                                ),
                                new SkillBadgeDto("Etat d'esprit agile"),
                                new SkillBadgeDto("Anglais")
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
                                SkillBadgeUtils.java,
                                SkillBadgeUtils.springBoot,
                                new SkillBadgeDto(
                                        "Apache Tapestry",
                                        SkillEnumUtils.apacheTapestryKeyword,
                                        SkillEnumUtils.apacheTapestryChildrenKeywords
                                )
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
                                SkillBadgeUtils.java,
                                new SkillBadgeDto(
                                        "Spring 5",
                                        SkillEnumUtils.springKeyword,
                                        SkillEnumUtils.springChildrenKeywords
                                ),
                                SkillBadgeUtils.keycloak,
                                new SkillBadgeDto(
                                        "Angular 8",
                                        SkillEnumUtils.angularKeyword,
                                        SkillEnumUtils.angularChildrenKeywords
                                ),
                                new SkillBadgeDto("MySQL", SkillEnumUtils.mySqlKeyword),
                                new SkillBadgeDto("Etat d'esprit agile")
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
                                SkillBadgeUtils.java,
                                new SkillBadgeDto(
                                        "Java EE",
                                        SkillEnumUtils.javaEeKeyword,
                                        SkillEnumUtils.javaEeChildrenKeywords
                                ),
                                new SkillBadgeDto("Web", SkillEnumUtils.webKeywords),
                                new SkillBadgeDto("MySQL", SkillEnumUtils.mySqlKeyword)
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
                                SkillBadgeUtils.java,
                                SkillBadgeUtils.springBoot,
                                SkillBadgeUtils.keycloak,
                                new SkillBadgeDto(
                                        "Angular 2",
                                        SkillEnumUtils.angularKeyword,
                                        SkillEnumUtils.angularChildrenKeywords
                                ),
                                new SkillBadgeDto(
                                        "Ionic 2",
                                        SkillEnumUtils.angularKeyword,
                                        SkillEnumUtils.angularChildrenKeywords
                                ),
                                new SkillBadgeDto("MongoDB", SkillEnumUtils.mongoDbKeyword),
                                SkillBadgeUtils.docker
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
                                SkillBadgeUtils.cSharp,
                                new SkillBadgeDto(
                                        "MVC .Net",
                                        SkillEnumUtils.mvcNetKeyword,
                                        SkillEnumUtils.mvcNetChildrenKeywords
                                ),
                                new SkillBadgeDto("Web", SkillEnumUtils.webKeywords),
                                new SkillBadgeDto("SQL")
                        )
                )
        );
    }
}
