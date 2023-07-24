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
public class HobbyDto {

    /**
     * Title
     */
    private String title;

    /**
     * Values
     */
    private List<String> values;

    /**
     * Indicates if "..." should be appended at the end of the values
     */
    private boolean ellipsis;
}
