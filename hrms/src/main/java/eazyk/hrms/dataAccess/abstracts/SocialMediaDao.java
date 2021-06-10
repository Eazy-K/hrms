package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Language;
import eazyk.hrms.entitites.concretes.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialMediaDao extends JpaRepository<SocialMedia, Integer> {

    SocialMedia getBySocialMediaId(int socialMediaId);

}
