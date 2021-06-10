package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.dtos.requests.CandidateAddRequest;
import eazyk.hrms.entitites.dtos.responses.CandidateResponse;

import java.util.List;

public interface CandidateService {

    DataResult<List<CandidateResponse>> getAllCandidates();

    Result saveCandidate(CandidateAddRequest candidateAddRequest) throws Exception;

    Candidate findById(int userId);


}
