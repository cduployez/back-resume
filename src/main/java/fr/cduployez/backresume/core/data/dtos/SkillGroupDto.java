package fr.cduployez.backresume.core.data.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SkillGroupDto {

    /**
     * Title
     */
    private String title;

    private List<SkillDto> skills;
}
