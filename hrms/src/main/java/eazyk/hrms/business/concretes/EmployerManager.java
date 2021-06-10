package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.EmployerService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.EmployerDao;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.dtos.requests.EmployerAddRequest;
import eazyk.hrms.entitites.dtos.responses.EmployerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class EmployerManager implements EmployerService {


    private final EmployerDao employerDao;

    private final DtoConverterService dtoConverterService;

    @Override
    public DataResult<List<EmployerResponse>> getAllEmployers() {
        return new SuccessDataResult<List<EmployerResponse>>("Data listelendi.",
                this.dtoConverterService.dtoConverter(this.employerDao.findAll(), EmployerResponse.class));
    }

    @Override
    public Result saveEmployer(EmployerAddRequest employerAddRequest) {

        Employer employer = (Employer) this.dtoConverterService.dtoClassConverter(employerAddRequest, Employer.class);

        if(this.employerDao.existsByEmail(employer.getEmail())) {
            return new ErrorResult("Kullanıcı sistemde mevcut!");
        }
        this.employerDao.save(employer);

        return new SuccessResult("İş veren eklendi.");
    }

    @Override
    public Employer getById(int userId) {
        return this.employerDao.getById(userId);
    }
}
