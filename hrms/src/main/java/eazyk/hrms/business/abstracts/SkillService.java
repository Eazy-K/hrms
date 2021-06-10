package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.concretes.Skill;
import eazyk.hrms.entitites.dtos.requests.SkillAddRequest;
import eazyk.hrms.entitites.dtos.responses.SkillResponse;

import java.util.List;

public interface SkillService {

    Result saveSkill(SkillAddRequest skillAddRequest);

    Skill saveSkill(Skill skill);

    DataResult<List<SkillResponse>> getAllSkills();

    Skill getBySkillId(int skillId);
}
