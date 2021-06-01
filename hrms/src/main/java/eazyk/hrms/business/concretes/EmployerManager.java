package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.EmployerService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.EmployerDao;
import eazyk.hrms.entitites.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    @Autowired
    private EmployerDao employerDao;


    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>("Data listelendi.", this.employerDao.findAll());
    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("İş veren eklendi.");
    }
}
