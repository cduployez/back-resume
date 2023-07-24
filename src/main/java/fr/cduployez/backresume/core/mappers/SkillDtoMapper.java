package fr.cduployez.backresume.core.mappers;

import fr.cduployez.backresume.core.data.dtos.SkillBadgeDto;
import fr.cduployez.backresume.core.data.dtos.SkillDto;
import fr.cduployez.backresume.core.exceptions.UnmappableDtoException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SkillDtoMapper {

    public static SkillDto toSkillDto(@NonNull SkillBadgeDto skillBadgeDto) throws UnmappableDtoException {
        int keywordsSize = CollectionUtils.isEmpty(skillBadgeDto.getKeywords()) ? 0 : skillBadgeDto.getKeywords().size();
        if (keywordsSize != 1) {
            throw new UnmappableDtoException("SkillBadgeDto %s contains multiple keywords".formatted(skillBadgeDto.toString()));
        }
        return new SkillDto(skillBadgeDto.getTitle(), skillBadgeDto.getKeywords().get(0), skillBadgeDto.getChildrenKeywords());
    }

    public static List<SkillDto> toSkillDtos(@NonNull List<SkillBadgeDto> skillBadgeDtos) throws UnmappableDtoException {
        List<SkillDto> skillDtos = new ArrayList<>(skillBadgeDtos.size());
        for (SkillBadgeDto skillBadgeDto : skillBadgeDtos) {
            if (skillBadgeDto != null) {
                SkillDto skillDto = toSkillDto(skillBadgeDto);
                skillDtos.add(skillDto);
            }
        }
        return skillDtos;
    }

}
