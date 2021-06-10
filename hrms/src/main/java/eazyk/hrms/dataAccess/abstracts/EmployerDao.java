package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

    boolean existsByEmail(String email);
    Employer getById(int userId);


  /*  @Query("Select new eazyk.hrms.entitites.dtos.EmployerDto(e.userId, e.companyName, e.webPage, e.phoneNumber) " +
            "From Employer e ")
    List<EmployerDto> getEmployer();
*/

}
