package fr.cduployez.backresume.core.data.dtos;

import fr.cduployez.backresume.core.data.enums.SkillEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SkillDto {

    private String title;

    private SkillEnum keyword;

    private List<SkillEnum> childrenKeywords;

    public SkillDto(String title, SkillEnum keyword) {
        this(title, keyword, Collections.emptyList());
    }
}
