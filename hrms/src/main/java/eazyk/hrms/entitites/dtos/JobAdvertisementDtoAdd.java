package eazyk.hrms.entitites.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class JobAdvertisementDtoAdd {


    private String jobDesctription;

    private int minSalary;

    private int maxSalary;

    private int numberOfJobPositions;

    private Date releaseDAte;

    private Date positionDeadline;

    private boolean positionIsActive;

    private int employerId;

    private int jobId;

    private int cityId;


}
