package eazyk.hrms.entitites.dtos.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LanguageResponse {

    @JsonIgnore
    private int languageId;


    private String languageName;


    private String languageLevel;
}
