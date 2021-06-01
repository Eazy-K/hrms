package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {



}
