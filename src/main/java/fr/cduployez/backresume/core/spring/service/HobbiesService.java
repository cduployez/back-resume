package fr.cduployez.backresume.core.spring.service;

import fr.cduployez.backresume.core.data.dtos.HobbyDto;
import fr.cduployez.backresume.core.spring.manager.HobbyManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class HobbiesService {

    private final HobbyManager hobbyManager;

    public List<HobbyDto> findAll() {
        return hobbyManager.findAll();
    }
}
