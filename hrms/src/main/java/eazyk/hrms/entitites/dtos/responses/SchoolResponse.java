package eazyk.hrms.entitites.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SchoolResponse {

    private int schoolId;

    private String description;


    private String schoolName;


    private String department;


    private Date startingDate;


    private Date endDate;


    private boolean isContinue;

}
