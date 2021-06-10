package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.SocialMediaService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.SocialMediaDao;
import eazyk.hrms.entitites.concretes.SocialMedia;
import eazyk.hrms.entitites.dtos.requests.SocialMediaAddRequest;
import eazyk.hrms.entitites.dtos.responses.SocialMediaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SocialMediaManager implements SocialMediaService {

    private final SocialMediaDao socialMediaDao;

    private final DtoConverterService dtoConverterService;

    @Override
    public Result saveSocialMedia(SocialMediaAddRequest socialMediaAddRequest) {
        this.socialMediaDao.save((SocialMedia) this.dtoConverterService.dtoClassConverter(socialMediaAddRequest, SocialMedia.class));
        return new SuccessResult("Sosyal medya eklendi.");
    }

    @Override
    public SocialMedia saveSocialMedia(SocialMedia socialMedia) {
        return this.socialMediaDao.save(socialMedia);
    }

    @Override
    public DataResult<List<SocialMediaResponse>> getAllSocialMedias() {
        return new SuccessDataResult<List<SocialMediaResponse>>("Data listelendi.",
                this.dtoConverterService.dtoConverter(this.socialMediaDao.findAll(), SocialMediaResponse.class));
    }

    @Override
    public SocialMedia getBySocialMediaId(int socialMediaId) {
        return this.socialMediaDao.getBySocialMediaId(socialMediaId);
    }


}
