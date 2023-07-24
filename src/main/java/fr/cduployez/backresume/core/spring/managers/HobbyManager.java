package fr.cduployez.backresume.core.spring.managers;

import fr.cduployez.backresume.core.data.dtos.HobbyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class HobbyManager {

    public List<HobbyDto> findAll() {
        return List.of(
                new HobbyDto("Films et séries", List.of("Inception", "Le Roi Lion", "Kaamelott"), true),
                new HobbyDto("Musique", List.of("Pratique de la guitare"), false),
                new HobbyDto("Sport", List.of("Natation", "Footing", "Escalade"), false)
        );
    }
}