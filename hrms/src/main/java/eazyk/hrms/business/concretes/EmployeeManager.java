package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.EmployeeService;
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
    public List<Employee> getAll() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee add(Employee employee) {
        return this.employeeDao.save(employee);
    }
}
