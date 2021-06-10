package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Language;
import eazyk.hrms.entitites.concretes.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDao extends JpaRepository<School, Integer> {

    School getBySchoolId(int schoolId);
}
