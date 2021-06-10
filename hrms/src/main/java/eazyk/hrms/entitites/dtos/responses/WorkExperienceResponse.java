package eazyk.hrms.entitites.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class WorkExperienceResponse {

    private int workExperienceId;

    private String companyName;

    private String jobPosition;

    private Date startingDate;

    private Date endDate;

    private boolean isContinue;
}
