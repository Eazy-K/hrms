package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.abstracts.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    boolean existsByEmail(String email);

    User getByEmail(String email);


}
