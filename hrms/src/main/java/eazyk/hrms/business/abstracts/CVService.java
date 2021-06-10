package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;

import eazyk.hrms.entitites.concretes.CV;
import eazyk.hrms.entitites.dtos.requests.CVAddRequest;
import eazyk.hrms.entitites.dtos.responses.CVResponse;

import java.util.List;

public interface CVService {

    Result saveCV(CVAddRequest cvAddRequest);


    DataResult<List<CVResponse>> getAllCVs();

    CV getByCvId(int cvId);

}
