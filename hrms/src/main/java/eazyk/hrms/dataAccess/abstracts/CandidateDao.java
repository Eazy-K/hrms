package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

    boolean existsByEmailOrIdentificationNumber(String email, String identificationNumber);

    Candidate findById(int userId);


}
