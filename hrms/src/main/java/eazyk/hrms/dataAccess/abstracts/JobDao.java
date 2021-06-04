package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Job, Integer> {

    boolean existsByJobName(String job);

//    @Query("Select new eazyk.hrms.entitites.dtos.JobDto(j.jobId, j.jobName) From Job j ")
  //  List<JobDto> getJobDetails();


    //select j.JobId, j.jobName, * from Job j

    Job getByJobId(int jobId);



}
