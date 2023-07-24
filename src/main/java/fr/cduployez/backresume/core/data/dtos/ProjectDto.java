package fr.cduployez.backresume.core.data.dtos;

import fr.cduployez.backresume.core.data.enums.JobTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectDto {

    /**
     * Project name
     */
    private String project;

    /**
     * Team size
     */
    private int teamSize;

    /**
     * Descriptions of the experience
     */
    private List<String> descriptions;

    /**
     * Skills
     */
    private List<SkillBadgeDto> skills;
}
