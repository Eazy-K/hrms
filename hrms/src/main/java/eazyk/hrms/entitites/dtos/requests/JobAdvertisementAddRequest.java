package eazyk.hrms.entitites.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementAddRequest {


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
