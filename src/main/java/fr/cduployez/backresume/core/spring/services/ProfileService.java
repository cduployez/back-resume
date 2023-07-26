package fr.cduployez.backresume.core.spring.services;

import fr.cduployez.backresume.core.data.dtos.ProfileDto;
import fr.cduployez.backresume.core.spring.managers.ProfileManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProfileService {

    private final ProfileManager profileManager;

    public ProfileDto get() {
        return profileManager.get();
    }
}
