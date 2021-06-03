package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.dtos.CandidateDto;

import java.util.List;

public interface CandidateService {

    DataResult<List<CandidateDto>> getAll();

    Result add(Candidate candidate) throws Exception;


}
