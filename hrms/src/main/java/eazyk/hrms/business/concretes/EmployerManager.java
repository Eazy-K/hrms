package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.EmployerService;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.EmployerDao;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.dtos.EmployerDtoAdd;
import eazyk.hrms.entitites.dtos.EmployerDtoGet;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EmployerManager implements EmployerService {


    private final EmployerDao employerDao;


    private final ModelMapper modelMapper;


    @Override
    public DataResult<List<EmployerDtoGet>> getAll() {

        List<Employer> employers = this.employerDao.findAll();
        List<EmployerDtoGet> employerDtoGets = employers.stream().map(item -> modelMapper.map(item, EmployerDtoGet.class)).collect(Collectors.toList());

        return new SuccessDataResult<List<EmployerDtoGet>>
                ("Data listelendi.", employerDtoGets);
    }

    @Override
    public Result add(EmployerDtoAdd employerDtoAdd) {

        Employer employer = this.modelMapper.map(employerDtoAdd, Employer.class);


        if(this.employerDao.existsByEmail(employer.getEmail())) {
            return new ErrorResult("Kullanıcı sistemde mevcut!");
        }

        this.employerDao.save(employer);
        return new SuccessResult("İş veren eklendi.");
    }

    @Override
    public Employer getByUserId(int userId) {
        return this.employerDao.getByUserId(userId);
    }
}
