package fr.cduployez.backresume.core.spring.service;

import fr.cduployez.backresume.core.data.dtos.LanguageDto;
import fr.cduployez.backresume.core.spring.manager.LanguageManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LanguagesService {

    private final LanguageManager languageManager;

    public List<LanguageDto> findAll() {
        return languageManager.findAll();
    }
}
