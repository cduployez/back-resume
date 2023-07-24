package fr.cduployez.backresume.core.data.dtos;

import fr.cduployez.backresume.core.data.enums.SkillEnum;
import lombok.*;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SkillBadgeDto {

    private String title;

    private List<SkillEnum> keywords;

    private List<SkillEnum> childrenKeywords;

    public SkillBadgeDto(String title) {
        this(title, Collections.emptyList(), Collections.emptyList());
    }

    public SkillBadgeDto(String title, List<SkillEnum> keywords) {
        this(title, keywords, Collections.emptyList());
    }
}
