package eazyk.hrms.entitites.dtos.requests;

import eazyk.hrms.entitites.concretes.Candidate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CVAddRequest {


    private int id;

    private String cvName;

    private String coverLetter;

    private String photoName;

//    private SocialMediaAddRequest socialMediaAddRequest;

    private List<LanguageAddRequest> languageAddRequests;

    private List<SchoolAddRequest> schoolAddRequests;

    private List<SkillAddRequest> skillAddRequests;

    private List<WorkExperienceAddRequest> workExperienceAddRequests;


}
