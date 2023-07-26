package fr.cduployez.backresume.core.data.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class ProfileDto {

    /**
     * First name
     */
    private String firstName;

    /**
     * Last name
     */
    private String lastName;

    /**
     * Email
     */
    private String email;

    /**
     * Date of birth
     */
    private LocalDate birthDate;

    /**
     * Living city
     */
    private String city;

    /**
     * Driving license description
     */
    private List<String> meansOfTransport;

    /**
     * Goals
     */
    private List<String> goals;

    /**
     * Title of the current position
     */
    private String position;



}
