package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.EmployeeService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.EmployeeDao;
import eazyk.hrms.entitites.concretes.Employee;
import eazyk.hrms.entitites.dtos.EmployeeDto;
import eazyk.hrms.entitites.dtos.JobDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeManager implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public DataResult<List<EmployeeDto>> getAll() {

        List<Employee> employees = this.employeeDao.findAll();
        List<EmployeeDto> employeeDtos = employees.stream().map(employee -> modelMapper.map(employee, EmployeeDto.class)).collect(Collectors.toList());


        return new SuccessDataResult<>
                ("Data listelendi.", employeeDtos);
    }

    @Override
    public Result add(Employee employee) {
        this.employeeDao.save(employee);
        return new SuccessResult("Çalışan eklendi.");
    }
}
