package fr.cduployez.backresume.core.spring.services;

import fr.cduployez.backresume.core.data.dtos.FormationDto;
import fr.cduployez.backresume.core.spring.managers.FormationManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FormationsService {

    private final FormationManager formationManager;

    public List<FormationDto> findAll() {
        return formationManager.findAll();
    }
}
