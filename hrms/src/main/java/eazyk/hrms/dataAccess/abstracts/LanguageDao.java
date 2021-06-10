package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LanguageDao extends JpaRepository<Language, Integer> {

}
