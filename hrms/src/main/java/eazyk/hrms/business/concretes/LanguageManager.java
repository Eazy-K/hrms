package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.LanguageService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.LanguageDao;
import eazyk.hrms.entitites.concretes.Language;
import eazyk.hrms.entitites.dtos.requests.LanguageAddRequest;
import eazyk.hrms.entitites.dtos.responses.LanguageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class LanguageManager implements LanguageService {

    private final LanguageDao languageDao;

    private final DtoConverterService dtoConverterService;

    @Override
    public Result saveLanguage(LanguageAddRequest languageAddRequest) {
        this.languageDao.save((Language) dtoConverterService.dtoClassConverter(languageAddRequest, Language.class));
        return new SuccessResult("Başarılı");
    }

    @Override
    public Result saveLanguage(Language language) {
        this.languageDao.save(language);
        return new SuccessResult("Başarılı.");
    }




    @Override
    public DataResult<List<LanguageResponse>> getAllLanguages() {
        return new SuccessDataResult<List<LanguageResponse>>("Data listelendi.",
                this.dtoConverterService.dtoConverter(languageDao.findAll(), LanguageResponse.class));
    }




}



