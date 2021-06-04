package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.CandidateDtoAdd;
import eazyk.hrms.entitites.dtos.CandidateDtoGet;

import java.util.List;

public interface CandidateService {

    DataResult<List<CandidateDtoGet>> getAll();

    Result add(CandidateDtoAdd candidateDtoAdd) throws Exception;


}
