package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.EmployerService;
import eazyk.hrms.core.utilities.config.ModelMapperConfig;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.EmployerDao;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.concretes.Job;
import eazyk.hrms.entitites.dtos.EmployerDto;
import eazyk.hrms.entitites.dtos.JobDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployerManager implements EmployerService {

    @Autowired
    private EmployerDao employerDao;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public DataResult<List<EmployerDto>> getAll() {

        List<Employer> employers = this.employerDao.findAll();
        List<EmployerDto> employerDtos = employers.stream().map(employer -> modelMapper.map(employer, EmployerDto.class)).collect(Collectors.toList());

        return new SuccessDataResult<List<EmployerDto>>
                ("Data listelendi.", employerDtos);
    }

    @Override
    public Result add(Employer employer) {




        if(this.employerDao.existsByEmail(employer.getEmail())) {
            return new ErrorResult("Kullanıcı sistemde mevcut!");
        }

        this.employerDao.save(employer);
        return new SuccessResult("İş veren eklendi.");
    }
}
