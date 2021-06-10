package eazyk.hrms.entitites.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
public class SchoolAddRequest {




    private String description;


    private String schoolName;


    private String department;


    private Date startingDate;


    private Date endDate;


    private boolean isContinue;
}
