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
public class ExperienceDto {

    /**
     * Date range of the experience
     */
    private DateRangeDto dateRange;

    /**
     * Company name
     */
    private String company;

    /**
     * Job type
     */
    private JobTypeEnum jobType;

    /**
     * Project name
     */
    private String project;

    /**
     * Descriptions of the experience
     */
    private List<String> descriptions;

    /**
     * Skills
     */
    private List<SkillBadgeDto> skills;
}
