package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.CV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CVDao extends JpaRepository<CV, Integer> {

    CV getByCvId(int cvId);

}
