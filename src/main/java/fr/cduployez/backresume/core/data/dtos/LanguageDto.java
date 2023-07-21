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
public class LanguageDto {

    /**
     * GDate range of the language
     */
    private DateRangeDto dateRange;

    /**
     * Title
     */
    private String title;

    /**
     * Descriptions
     */
    private List<String> descriptions;

}
