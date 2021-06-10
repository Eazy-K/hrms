package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Language;
import eazyk.hrms.entitites.concretes.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkExperienceDao extends JpaRepository<WorkExperience, Integer> {

    WorkExperience getByWorkExperienceId(int workExperienceId);

}
