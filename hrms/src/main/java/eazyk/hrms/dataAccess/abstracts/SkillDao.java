package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Language;
import eazyk.hrms.entitites.concretes.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillDao extends JpaRepository<Skill, Integer> {

    Skill getBySkillId(int skillId);

}
