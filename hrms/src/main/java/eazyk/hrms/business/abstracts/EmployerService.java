package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.dtos.EmployerDtoAdd;
import eazyk.hrms.entitites.dtos.EmployerDtoGet;

import java.util.List;

public interface EmployerService {

    DataResult<List<EmployerDtoGet>> getAll();

    Result add(EmployerDtoAdd employerDtoAdd);

    Employer getByUserId(int userId);
}
