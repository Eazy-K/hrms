package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.EmployeeService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.EmployeeDao;
import eazyk.hrms.entitites.concretes.Employee;
import eazyk.hrms.entitites.dtos.EmployeeDtoAdd;
import eazyk.hrms.entitites.dtos.EmployeeDtoGet;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EmployeeManager implements EmployeeService {


    private final EmployeeDao employeeDao;


    private final ModelMapper modelMapper;


    @Override
    public DataResult<List<EmployeeDtoGet>> getAll() {

        List<Employee> employees = this.employeeDao.findAll();
        List<EmployeeDtoGet> employeeDtoGets = employees.stream().map(employee -> modelMapper.map(employee, EmployeeDtoGet.class)).collect(Collectors.toList());


        return new SuccessDataResult<>
                ("Data listelendi.", employeeDtoGets);
    }

    @Override
    public Result add(EmployeeDtoAdd employeeDtoAdd) {
        Employee employee = this.modelMapper.map(employeeDtoAdd, Employee.class);
        this.employeeDao.save(employee);
        return new SuccessResult("Çalışan eklendi.");
    }
}
