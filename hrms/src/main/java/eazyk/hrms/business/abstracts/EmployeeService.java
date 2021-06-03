package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.Employee;
import eazyk.hrms.entitites.dtos.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    DataResult<List<EmployeeDto>> getAll();

    Result add(Employee employee);
}
