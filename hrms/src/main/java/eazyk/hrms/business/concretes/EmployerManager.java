package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.EmployerService;
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
    public List<Employer> getAll() {
        return this.employerDao.findAll();
    }

    @Override
    public Employer add(Employer employer) {
        return this.employerDao.save(employer);
    }
}
