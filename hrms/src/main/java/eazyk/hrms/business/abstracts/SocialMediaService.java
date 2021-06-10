package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.SocialMedia;
import eazyk.hrms.entitites.dtos.requests.SocialMediaAddRequest;
import eazyk.hrms.entitites.dtos.responses.SocialMediaResponse;

import java.util.List;

public interface SocialMediaService {

    Result saveSocialMedia(SocialMediaAddRequest socialMediaAddRequest);

    SocialMedia saveSocialMedia(SocialMedia socialMedia);

    DataResult<List<SocialMediaResponse>> getAllSocialMedias();

    SocialMedia getBySocialMediaId(int socialMediaId);

}
