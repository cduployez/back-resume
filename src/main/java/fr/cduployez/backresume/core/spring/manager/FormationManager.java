package fr.cduployez.backresume.core.spring.manager;

import fr.cduployez.backresume.core.data.dtos.DateRangeDto;
import fr.cduployez.backresume.core.data.dtos.FormationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.util.List;

@RequiredArgsConstructor
@Component
public class FormationManager {

    private final Clock clock;

    public List<FormationDto> findAll() {
        return List.of(
                new FormationDto(DateRangeDto.yearRange(2015, 2017, clock),
                        "ISEN Lille - Ecole d'ingénieur",
                        List.of("Spécialisé en Développement Logiciel et Big Data", "Contrat de professionnalisation")),
                new FormationDto(DateRangeDto.yearRange(2012, 2015, clock),
                        "ISEN Lille - Ecole d'ingénieur",
                        List.of("Cycle Informatique et Réseaux, Diplômé Bachelor ISEN")),
                new FormationDto(DateRangeDto.yearRange(2009, 2012, clock),
                        "Institut de Genech",
                        List.of("Baccalauréat Série Scientifique, Mention Très Bien", "Section Européenne"))
        );
    }
}
