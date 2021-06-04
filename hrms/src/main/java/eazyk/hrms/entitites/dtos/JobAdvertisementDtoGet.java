package eazyk.hrms.entitites.dtos;

import lombok.*;


import java.util.Date;

@Getter
@Setter
public class JobAdvertisementDtoGet {


    private int jobAdvertisementIid;

    private String jobDesctription;

    private int numberOfJobPositions;

    private Date releaseDAte;

    private Date positionDeadline;








}
