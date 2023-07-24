package fr.cduployez.backresume.core.spring.service;

import fr.cduployez.backresume.core.data.dtos.FormationDto;
import fr.cduployez.backresume.core.spring.manager.FormationManager;
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
