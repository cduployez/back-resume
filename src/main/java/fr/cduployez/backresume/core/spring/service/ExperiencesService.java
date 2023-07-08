package fr.cduployez.backresume.core.spring.service;

import fr.cduployez.backresume.core.data.dtos.ExperienceDto;
import fr.cduployez.backresume.core.spring.manager.ExperienceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ExperiencesService {

    private final ExperienceManager experienceManager;

    public List<ExperienceDto> findAll() {
        return experienceManager.findAll();
    }
}
