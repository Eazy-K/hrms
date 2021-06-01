package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.concretes.Employee;

import java.util.List;

public interface EmployeeService {

    DataResult<List<Employee>> getAll();

    Result add(Employee employee);
}
