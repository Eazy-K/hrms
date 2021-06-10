package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.Language;
import eazyk.hrms.entitites.dtos.requests.LanguageAddRequest;
import eazyk.hrms.entitites.dtos.responses.LanguageResponse;

import java.util.List;

public interface LanguageService {

    Result saveLanguage(LanguageAddRequest languageAddRequest);

    Result saveLanguage(Language language);

    DataResult<List<LanguageResponse>> getAllLanguages();





}
