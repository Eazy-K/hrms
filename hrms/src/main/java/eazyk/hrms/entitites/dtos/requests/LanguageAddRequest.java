package eazyk.hrms.entitites.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LanguageAddRequest {


    private String languageName;


    private String languageLevel;


}
