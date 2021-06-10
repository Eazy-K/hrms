package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.EmployeeService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.EmployeeDao;
import eazyk.hrms.entitites.concretes.Employee;
import eazyk.hrms.entitites.dtos.requests.EmployeeAddRequest;
import eazyk.hrms.entitites.dtos.responses.EmployeeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class EmployeeManager implements EmployeeService {


    private final EmployeeDao employeeDao;

    private final DtoConverterService dtoConverterService;


    @Override
    public DataResult<List<EmployeeResponse>> getAllEmployees() {


        return new SuccessDataResult<>("Data listelendi.",
                this.dtoConverterService.dtoConverter(this.employeeDao.findAll(), EmployeeResponse.class));
    }

    @Override
    public Result saveEmployee(EmployeeAddRequest employeeAddRequest) {
        this.employeeDao.save((Employee) this.dtoConverterService.dtoClassConverter(employeeAddRequest, Employee.class));
        return new SuccessResult("Çalışan eklendi.");
    }
}
