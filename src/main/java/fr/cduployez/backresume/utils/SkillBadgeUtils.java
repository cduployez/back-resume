package fr.cduployez.backresume.utils;

import fr.cduployez.backresume.core.data.dtos.SkillBadgeDto;
import fr.cduployez.backresume.core.data.enums.SkillEnum;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SkillBadgeUtils {

    public static SkillBadgeDto angular(int version) {
        return new SkillBadgeDto("Angular %d".formatted(version), SkillEnumUtils.angularKeyword, SkillEnumUtils.angularChildrenKeywords);
    }

    public static SkillBadgeDto azure() {
        return new SkillBadgeDto(
                "Azure",
                SkillEnumUtils.azureKeyword,
                SkillEnumUtils.azureChildrenKeywords
        );
    }

    public static SkillBadgeDto java() {
        return new SkillBadgeDto("Java", SkillEnumUtils.javaKeyword);
    }

    public static SkillBadgeDto javaEe() {
        return new SkillBadgeDto("Java EE", SkillEnumUtils.javaEeKeyword, SkillEnumUtils.javaEeChildrenKeywords);
    }

    public static SkillBadgeDto web() {
        return new SkillBadgeDto("Web", SkillEnumUtils.webKeywords);
    }

    public static SkillBadgeDto springBoot() {
        return new SkillBadgeDto("Spring Boot", SkillEnumUtils.springKeyword, SkillEnumUtils.springChildrenKeywords);
    }

    public static SkillBadgeDto cSharp() {
        return new SkillBadgeDto("C#", SkillEnumUtils.cSharpKeyword);
    }

    public static SkillBadgeDto cPlusPlus() {
        return new SkillBadgeDto("C++", Collections.singletonList(SkillEnum.C_PLUS_PLUS));
    }

    public static SkillBadgeDto english() {
        return new SkillBadgeDto("Anglais");
    }

    public static SkillBadgeDto keycloak() {
        return new SkillBadgeDto("Keycloak", SkillEnumUtils.keycloakKeyword);
    }

    public static SkillBadgeDto kubernetes() {
        return new SkillBadgeDto("Kubernetes", SkillEnumUtils.kubernetesKeyword, SkillEnumUtils.kubernetesChildrenKeywords);
    }

    public static SkillBadgeDto openshift() {
        return new SkillBadgeDto("Openshift", SkillEnumUtils.openshiftKeyword, SkillEnumUtils.openshiftChildrenKeywords);
    }

    public static SkillBadgeDto kafka() {
        return new SkillBadgeDto("Kafka");
    }

    public static SkillBadgeDto docker() {
        return new SkillBadgeDto("Docker", SkillEnumUtils.dockerKeyword);
    }

    public static SkillBadgeDto agile() {
        return new SkillBadgeDto("Etat d'esprit agile");
    }

    public static SkillBadgeDto mySql() {
        return new SkillBadgeDto("MySQL", SkillEnumUtils.mySqlKeyword);
    }

    public static SkillBadgeDto apacheTapestry() {
        return new SkillBadgeDto(
                "Apache Tapestry",
                SkillEnumUtils.apacheTapestryKeyword,
                SkillEnumUtils.apacheTapestryChildrenKeywords
        );
    }

    public static SkillBadgeDto spring(int version) {
        return new SkillBadgeDto("Spring %d".formatted(version), SkillEnumUtils.springKeyword, SkillEnumUtils.springChildrenKeywords);
    }

    public static SkillBadgeDto ionic(int version) {
        return new SkillBadgeDto("Ionic %d".formatted(version), SkillEnumUtils.angularKeyword, SkillEnumUtils.angularChildrenKeywords);
    }

    public static SkillBadgeDto mongoDb() {
        return new SkillBadgeDto("MongoDB", SkillEnumUtils.mongoDbKeyword);
    }

    public static SkillBadgeDto mvcNet() {
        return new SkillBadgeDto("MVC .Net", SkillEnumUtils.mvcNetKeyword, SkillEnumUtils.mvcNetChildrenKeywords);
    }

    /**
     * .NET
     */
    public static SkillBadgeDto net() {
        return new SkillBadgeDto(".NET", List.of(SkillEnum.NET), SkillEnumUtils.netChildrenKeywords);
    }

    public static SkillBadgeDto android(int version) {
        return new SkillBadgeDto("Android %d".formatted(version), List.of(SkillEnum.ANDROID), SkillEnumUtils.androidChildrenKeywords);
    }

    public static SkillBadgeDto xamarin() {
        return new SkillBadgeDto("Xamarin", List.of(SkillEnum.XAMARIN), SkillEnumUtils.xamarinChildrenKeywords);
    }

    public static SkillBadgeDto python() {
        return new SkillBadgeDto("Python", SkillEnumUtils.pythonKeyword);
    }

    public static SkillBadgeDto openCv() {
        return new SkillBadgeDto("OpenCV", List.of(), SkillEnumUtils.openCvChildrenKeywords);
    }

    public static SkillBadgeDto html() {
        return new SkillBadgeDto("HTML", List.of(SkillEnum.HTML));
    }

    public static SkillBadgeDto css() {
        return new SkillBadgeDto("CSS", List.of(SkillEnum.CSS));
    }

    public static SkillBadgeDto javaScript() {
        return new SkillBadgeDto("JavaScript", List.of(SkillEnum.JAVASCRIPT));
    }

    public static SkillBadgeDto googleMaps() {
        return new SkillBadgeDto("Google Maps", List.of(), List.of(SkillEnum.JAVASCRIPT));
    }


}
