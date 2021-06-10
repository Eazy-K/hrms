package eazyk.hrms.entitites.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
public class WorkExperienceAddRequest {




    private String companyName;


    private String jobPosition;


    private Date startingDate;


    private Date endDate;


    private boolean isContinue;
}
