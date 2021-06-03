package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.Employee;
import eazyk.hrms.entitites.concretes.Employer;
import eazyk.hrms.entitites.dtos.EmployerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

    boolean existsByEmail(String email);


  /*  @Query("Select new eazyk.hrms.entitites.dtos.EmployerDto(e.userId, e.companyName, e.webPage, e.phoneNumber) " +
            "From Employer e ")
    List<EmployerDto> getEmployer();
*/

}
