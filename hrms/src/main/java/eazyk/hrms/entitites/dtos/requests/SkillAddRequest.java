package eazyk.hrms.entitites.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class SkillAddRequest {

    private String programmingLanguage;


    private String technology;

}
