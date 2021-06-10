package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.School;
import eazyk.hrms.entitites.dtos.requests.SchoolAddRequest;
import eazyk.hrms.entitites.dtos.responses.SchoolResponse;

import java.util.List;

public interface SchoolService {

    Result saveSchool(SchoolAddRequest schoolAddRequest);

    School saveSchool(School school);

    DataResult<List<SchoolResponse>> getAllSchools();

    School getBySchoolId(int schoolId);

}
