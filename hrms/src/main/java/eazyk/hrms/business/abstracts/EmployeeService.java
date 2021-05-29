package eazyk.hrms.business.abstracts;

import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.concretes.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    Employee add(Employee employee);
}
