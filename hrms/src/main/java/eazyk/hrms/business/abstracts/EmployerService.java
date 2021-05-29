package eazyk.hrms.business.abstracts;

import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.concretes.Employee;
import eazyk.hrms.entitites.concretes.Employer;

import java.util.List;

public interface EmployerService {

    List<Employer> getAll();

    Employer add(Employer employer);
}
