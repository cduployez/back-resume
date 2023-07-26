package fr.cduployez.backresume.core.spring.managers;

import fr.cduployez.backresume.core.data.dtos.ProfileDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class ProfileManager {

    private final String profileEmail;

    public ProfileManager(@Value("${duployez.profile.email}") String profileEmail) {
        this.profileEmail = profileEmail;
    }

    public ProfileDto get() {
        ProfileDto dto = new ProfileDto();
        dto.setFirstName("Clément");
        dto.setLastName("Duployez");
        dto.setEmail(profileEmail);
        dto.setBirthDate(LocalDate.of(1994, 7, 5));
        dto.setCity("Lillois");
        dto.setMeansOfTransport(List.of("Permis B (Véhicule)", "Télétravail"));
        dto.setGoals(List.of("Développement logiciel en équipe",
                "Evolution souhaitée vers l'expertise technique"));
        dto.setPosition("Ingénieur Etudes et Développement - Fullstack");
        return dto;
    }

}
