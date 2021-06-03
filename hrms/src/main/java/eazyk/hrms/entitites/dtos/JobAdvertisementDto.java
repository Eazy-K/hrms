package eazyk.hrms.entitites.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementDto {


    int id;

    private String jobDesctription;

    private int minSalary;

    private int maxSalary;

    private int numberOfJobPositions;

    private Date positionDeadline;

    private String companyName;

   private String jobPossion;

    private String cityName;





}
