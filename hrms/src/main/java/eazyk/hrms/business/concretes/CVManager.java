package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.*;
import eazyk.hrms.core.utilities.cloudinary.CloudinaryService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.*;
import eazyk.hrms.dataAccess.abstracts.CVDao;
import eazyk.hrms.entitites.concretes.*;
import eazyk.hrms.entitites.dtos.requests.CVAddRequest;
import eazyk.hrms.entitites.dtos.responses.CVResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class CVManager implements CVService {

    private final CVDao cvDao;

    private final LanguageService languageService;
    private final SchoolService schoolService;
    private final SkillService skillService;
    private final SocialMediaService socialMediaService;
    private final WorkExperienceService workExperienceService;
    private final CandidateService candidateService;
    private final DtoConverterService dtoConverterService;
    private final CloudinaryService cloudinaryService;





    @Override
    public Result saveCV(CVAddRequest cvAddRequest) {

        CV cv= (CV) this.dtoConverterService.dtoClassConverter(cvAddRequest, CV.class);
        Candidate candidate = this.candidateService.findById(cvAddRequest.getId());
        System.out.println(candidate.getFirstName());
        cv.setCandidate(candidate);



        List<Language> languages = this.dtoConverterService.dtoConverter(cvAddRequest.getLanguageAddRequests(), Language.class);
        List<Skill> skills = this.dtoConverterService.dtoConverter(cvAddRequest.getSkillAddRequests(), Skill.class);
        List<School> schools = this.dtoConverterService.dtoConverter(cvAddRequest.getSchoolAddRequests(), School.class);
        List<WorkExperience> workExperiences = this.dtoConverterService.dtoConverter(cvAddRequest.getWorkExperienceAddRequests(), WorkExperience.class);

        this.cvDao.save(cv);

        for (Language language : languages) {
            language.setCv(cvDao.getByCvId(cv.getCvId()));
            this.languageService.saveLanguage(language);
        }

        for (Skill skill : skills) {
            skill.setCv(cvDao.getByCvId(cv.getCvId()));
            this.skillService.saveSkill(skill);
        }

        for (School school : schools) {
            school.setCv(this.cvDao.getByCvId(cv.getCvId()));
            this.schoolService.saveSchool(school);
        }

        for (WorkExperience workExperience : workExperiences) {
            workExperience.setCv(cvDao.getByCvId(cv.getCvId()));
            this.workExperienceService.saveWorkExperience(workExperience);
        }



        return new SuccessResult("CV oluşturuldu.");
    }

    @Override
    public Result saveImage(MultipartFile file, int cvId) {
        @SuppressWarnings("unchecked")
        Map<String, String> upload = (Map<String, String>) cloudinaryService.save(file).getData();
        String imageUrl = upload.get("url");
        CV cv = cvDao.getByCvId(cvId);
        cv.setPhotoName(imageUrl);
        cvDao.save(cv);
        return new SuccessResult("Kayıt Başarılı");
    }


    @Override
    public DataResult<List<CVResponse>> getAllCVs() {


        return new SuccessDataResult<List<CVResponse>>("Data listelendi.",
                dtoConverterService.
                        dtoConverter(cvDao.findAll(), CVResponse.class));
    }

    @Override
    public CV getByCvId(int cvId) {
        return this.cvDao.getByCvId(cvId);
    }
}
