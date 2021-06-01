package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.EmployeeService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.EmployeeDao;
import eazyk.hrms.entitites.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<>("Data listelendi.", this.employeeDao.findAll());
    }

    @Override
    public Result add(Employee employee) {
        this.employeeDao.save(employee);
        return new SuccessResult("Çalışan eklendi.");
    }
}
