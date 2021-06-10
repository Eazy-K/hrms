package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

    boolean existsByJobName(String job);

    JobPosition getByJobId(int jobId);




}
