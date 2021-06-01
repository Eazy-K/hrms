package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Job, Integer> {

    boolean existsByJobName(String job);


}
