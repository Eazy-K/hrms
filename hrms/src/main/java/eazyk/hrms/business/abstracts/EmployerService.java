package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.dtos.requests.EmployerAddRequest;
import eazyk.hrms.entitites.dtos.responses.EmployerResponse;

import java.util.List;

public interface EmployerService {

    DataResult<List<EmployerResponse>> getAllEmployers();

    Result saveEmployer(EmployerAddRequest employerAddRequest);

    Employer getById(int userId);
}
