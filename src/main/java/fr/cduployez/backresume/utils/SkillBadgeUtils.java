package fr.cduployez.backresume.utils;

import fr.cduployez.backresume.core.data.dtos.SkillBadgeDto;
import fr.cduployez.backresume.core.data.enums.SkillEnum;

import java.util.Collections;

public class SkillBadgeUtils {

    public static final SkillBadgeDto java = new SkillBadgeDto("Java", SkillEnumUtils.javaKeyword);

    public static final SkillBadgeDto springBoot = new SkillBadgeDto("Spring Boot", SkillEnumUtils.springKeyword, SkillEnumUtils.springChildrenKeywords);

    public static final SkillBadgeDto cSharp = new SkillBadgeDto("C#", SkillEnumUtils.cSharpKeyword);

    public static final SkillBadgeDto cPlusPlus = new SkillBadgeDto("C++", Collections.singletonList(SkillEnum.C_PLUS_PLUS));

    public static final SkillBadgeDto keycloak = new SkillBadgeDto("Keycloak", SkillEnumUtils.keycloakKeyword);

    public static final SkillBadgeDto docker = new SkillBadgeDto("Docker", SkillEnumUtils.dockerKeyword);

}
