package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.JobAdvertisement;
import eazyk.hrms.entitites.dtos.JobAdvertisementDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {


 /*   @Query("select new eazyk.hrms.entitites.dtos.JobAdvertisementDto(j.jobAdvertisementIid, j.jobDesctription, j.minSalary, j.maxSalary, j.numberOfJobPositions, j.positionDeadline, e.companyName, jo.jobName, c.cityName)" +
            " FROM JobAdvertisement  j " +
            "inner join j.employers e " +
            "inner join j.jobs jo  " +
            "inner join j.cities c")
    List<JobAdvertisementDto> getJobAdvertisement();

*/


}
