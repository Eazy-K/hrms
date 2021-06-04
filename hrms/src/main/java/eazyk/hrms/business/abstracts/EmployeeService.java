package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.EmployeeDtoAdd;
import eazyk.hrms.entitites.dtos.EmployeeDtoGet;


import java.util.List;

public interface EmployeeService {

    DataResult<List<EmployeeDtoGet>> getAll();

    Result add(EmployeeDtoAdd employeeDtoAdd);
}
