package fr.cduployez.backresume.core.spring.manager;

import fr.cduployez.backresume.core.data.dtos.ProjectDto;
import fr.cduployez.backresume.utils.SkillBadgeUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.util.List;

@RequiredArgsConstructor
@Component
public class ProjectManager {

    private final Clock clock;

    public List<ProjectDto> findAll() {
        return List.of(
                new ProjectDto("TwinMax", 5,
                        List.of("Application Android de calcul et affichage de courbes en temps réel afin de calibrer les carburateurs d’une moto pour l’entreprise Selectronic"),
                        List.of(SkillBadgeUtils.android(5))),
                new ProjectDto("MatchFM", 4,
                        List.of("Application Android de rencontre de personnes autour des recommandations musicales"),
                        List.of(SkillBadgeUtils.xamarin(), SkillBadgeUtils.net())),
                new ProjectDto("Rubik Pixel Art Solver", 5,
                        List.of("Robot de scan et reproduction d'images avec des Rubik's Cubes"),
                        List.of(SkillBadgeUtils.python(), SkillBadgeUtils.openCv())
                ),
                new ProjectDto("Traveling Bradeux Problem Solver", 3,
                        List.of("Planification de tournées sur Google Maps"),
                        List.of(SkillBadgeUtils.html(), SkillBadgeUtils.css(), SkillBadgeUtils.javaScript(), SkillBadgeUtils.googleMaps(), SkillBadgeUtils.cPlusPlus()))
        );
    }
}
