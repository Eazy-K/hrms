package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.SchoolService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.SchoolDao;
import eazyk.hrms.entitites.concretes.School;
import eazyk.hrms.entitites.dtos.requests.SchoolAddRequest;
import eazyk.hrms.entitites.dtos.responses.SchoolResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SchoolManager implements SchoolService {

    private final SchoolDao schoolDao;

    private final DtoConverterService dtoConverterService;

    @Override
    public Result saveSchool(SchoolAddRequest schoolAddRequest) {
        this.schoolDao.save((School) dtoConverterService.dtoClassConverter(schoolAddRequest, School.class));
        return new SuccessResult("Okul bilgisi eklendi.");
    }

    @Override
    public School saveSchool(School school) {
        return this.schoolDao.save(school);
    }

    @Override
    public DataResult<List<SchoolResponse>> getAllSchools() {
        return new SuccessDataResult<List<SchoolResponse>>("Data listelendi.",
                this.dtoConverterService.dtoConverter(this.schoolDao.findAll(), SchoolResponse.class));
    }

    public School getBySchoolId(int schoolId) {
        return this.schoolDao.getBySchoolId(schoolId);
    }

}
