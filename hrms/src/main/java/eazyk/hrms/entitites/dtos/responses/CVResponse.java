package eazyk.hrms.entitites.dtos.responses;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CVResponse {


    private int cvId;

    private String cvName;

    private String coverLetter;

    private CandidateResponse candidateResponse;

    private List<LanguageResponse> languages;

    private List<SchoolResponse> schools;

    private List<SkillResponse> skills;

    private SocialMediaResponse socialMedia;

    private List<WorkExperienceResponse> workExperiences;






}
