package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
}
