package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Job;
import eazyk.hrms.entitites.dtos.JobDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobDao extends JpaRepository<Job, Integer> {

    boolean existsByJobName(String job);

//    @Query("Select new eazyk.hrms.entitites.dtos.JobDto(j.jobId, j.jobName) From Job j ")
  //  List<JobDto> getJobDetails();


    //select j.JobId, j.jobName, * from Job j



}
