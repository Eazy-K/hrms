package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.LanguageService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.LanguageAddRequest;
import eazyk.hrms.entitites.dtos.responses.LanguageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/language")
public class LanguagesController {

    private final LanguageService languageService;

    @PostMapping("/saveLanguage")
    public Result saveLanguage (@RequestBody LanguageAddRequest languageAddRequest) {
        return this.languageService.saveLanguage(languageAddRequest);
    }

    @GetMapping("/getLanguages")
    public DataResult<List<LanguageResponse>> getLanguages() {
        return this.languageService.getAllLanguages();
    }


}
