package fr.cduployez.backresume.utils;

import fr.cduployez.backresume.core.data.enums.SkillEnum;

import java.util.List;

public class SkillEnumUtils {


    public static final List<SkillEnum> javaKeyword = List.of(SkillEnum.JAVA);

    public static final List<SkillEnum> mySqlKeyword = List.of(SkillEnum.MYSQL);

    public static final List<SkillEnum> springKeyword = List.of(SkillEnum.SPRING);

    public static final List<SkillEnum> springChildrenKeywords = SkillEnumUtils.javaKeyword;

    public static final List<SkillEnum> keycloakKeyword = List.of(SkillEnum.KEYCLOAK);

    public static final List<SkillEnum> javaEeKeyword = List.of(SkillEnum.JAVA_EE);

    public static final List<SkillEnum> javaEeChildrenKeywords = SkillEnumUtils.javaKeyword;

    public static final List<SkillEnum> pythonKeyword = List.of(SkillEnum.PYTHON);

    public static final List<SkillEnum> openCvChildrenKeywords = SkillEnumUtils.pythonKeyword;

    public static final List<SkillEnum> androidChildrenKeywords = SkillEnumUtils.javaKeyword;

    public static final List<SkillEnum> xamarinChildrenKeywords = List.of(SkillEnum.C_SHARP, SkillEnum.ANDROID);

    public static final List<SkillEnum> cSharpKeyword = List.of(SkillEnum.C_SHARP);

    public static final List<SkillEnum> mvcNetKeyword = List.of(SkillEnum.MVC_NET);

    public static final List<SkillEnum> netChildrenKeywords = SkillEnumUtils.cSharpKeyword;

    public static final List<SkillEnum> mvcNetChildrenKeywords = List.of(SkillEnum.C_SHARP, SkillEnum.HTML);

    public static final List<SkillEnum> angularKeyword = List.of(SkillEnum.ANGULAR);

    public static final List<SkillEnum> angularChildrenKeywords = List.of(SkillEnum.TYPESCRIPT, SkillEnum.CSS, SkillEnum.HTML);

    public static final List<SkillEnum> webKeywords = List.of(SkillEnum.HTML, SkillEnum.CSS, SkillEnum.JAVASCRIPT);

    public static final List<SkillEnum> apacheTapestryKeyword = List.of(SkillEnum.APACHE_TAPESTRY);

    public static final List<SkillEnum> apacheTapestryChildrenKeywords = List.of(SkillEnum.HTML, SkillEnum.CSS, SkillEnum.JAVA);

    public static final List<SkillEnum> mongoDbKeyword = List.of(SkillEnum.MONGODB);

    public static final List<SkillEnum> dockerKeyword = List.of(SkillEnum.DOCKER);

    public static final List<SkillEnum> kubernetesKeyword = List.of(SkillEnum.KUBERNETES);

    public static final List<SkillEnum> kubernetesChildrenKeywords = SkillEnumUtils.dockerKeyword;

    public static final List<SkillEnum> azureKeyword = List.of(SkillEnum.AZURE);

    public static final List<SkillEnum> azureChildrenKeywords = List.of(SkillEnum.DOCKER, SkillEnum.KUBERNETES);

    public static final List<SkillEnum> openshiftKeyword = List.of(SkillEnum.OPENSHIFT);

    public static final List<SkillEnum> openshiftChildrenKeywords = List.of(SkillEnum.DOCKER, SkillEnum.KUBERNETES);

    public static final List<SkillEnum> typeScriptChildrenKeywords = List.of(SkillEnum.JAVASCRIPT);
}
