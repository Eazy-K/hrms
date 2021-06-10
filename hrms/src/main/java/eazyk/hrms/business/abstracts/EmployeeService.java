package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.EmployeeAddRequest;
import eazyk.hrms.entitites.dtos.responses.EmployeeResponse;


import java.util.List;

public interface EmployeeService {

    DataResult<List<EmployeeResponse>> getAllEmployees();

    Result saveEmployee(EmployeeAddRequest employeeAddRequest);
}
