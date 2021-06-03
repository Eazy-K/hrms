package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.dtos.EmployerDto;

import java.util.List;

public interface EmployerService {

    DataResult<List<EmployerDto>> getAll();

    Result add(Employer employer);
}
