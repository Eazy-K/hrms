package eazyk.hrms.entitites.dtos.responses;

import lombok.*;


import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementResponse {


    private int jobAdvertisementIid;

    private String jobDesctription;

    private int numberOfJobPositions;

    private Date releaseDAte;

    private Date positionDeadline;

    private int employerId;

    private int jobId;

    private int cityId;








}
