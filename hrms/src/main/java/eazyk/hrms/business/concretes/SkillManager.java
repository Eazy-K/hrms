package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.SkillService;
import eazyk.hrms.core.utilities.converters.dtoConverter.DtoConverterService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.SkillDao;
import eazyk.hrms.entitites.concretes.Skill;
import eazyk.hrms.entitites.dtos.requests.SkillAddRequest;
import eazyk.hrms.entitites.dtos.responses.SkillResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SkillManager implements SkillService {

    private final SkillDao skillDao;

    private final DtoConverterService dtoConverterService;

    @Override
    public Result saveSkill(SkillAddRequest skillAddRequest) {
        this.skillDao.save((Skill) this.dtoConverterService.dtoClassConverter(skillAddRequest, Skill.class));
        return new SuccessResult("Yetenek eklendi.");
    }

    @Override
    public Skill saveSkill(Skill skill) {
        return this.skillDao.save(skill);
    }

    @Override
    public DataResult<List<SkillResponse>> getAllSkills() {
        return new SuccessDataResult<List<SkillResponse>>("Data listelendi.",
                this.dtoConverterService.dtoConverter(this.skillDao.findAll(), SkillResponse.class));
    }

    public Skill getBySkillId(int skillId) {
        return this.skillDao.getBySkillId(skillId);
    }

    }

