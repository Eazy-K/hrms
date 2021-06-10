package eazyk.hrms.api.controllers;

import eazyk.hrms.business.abstracts.SocialMediaService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.SocialMediaAddRequest;
import eazyk.hrms.entitites.dtos.responses.SocialMediaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/socialMedia")
public class SocialMediasController {

    private final SocialMediaService socialMediaService;


    @PostMapping("/saveSocialMedia")
    public Result saveSocialMedia (@RequestBody SocialMediaAddRequest socialMediaAddRequest) {
        return this.socialMediaService.saveSocialMedia(socialMediaAddRequest);
    }

    @GetMapping("/getSocialMedias")
    public DataResult<List<SocialMediaResponse>> getSocialMedias() {
        return this.socialMediaService.getAllSocialMedias();
    }



}
