package fr.cduployez.backresume.core.spring.manager;

import fr.cduployez.backresume.core.data.dtos.DateRangeDto;
import fr.cduployez.backresume.core.data.dtos.LanguageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.util.List;

@RequiredArgsConstructor
@Component
public class LanguageManager {

    private final Clock clock;

    public List<LanguageDto> findAll() {
        return List.of(
                new LanguageDto(DateRangeDto.year(2017, clock), "TOEIC", List.of("Score : 975")),
                new LanguageDto(DateRangeDto.year(2011, clock), "First Certificate in English", List.of("Grade A, Niveau Européen C1"))
        );
    }
}