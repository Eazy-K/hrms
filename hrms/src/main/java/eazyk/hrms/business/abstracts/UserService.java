package eazyk.hrms.business.abstracts;

import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.abstracts.User;

import java.util.List;

public interface UserService {

    DataResult<List<User>> getAllUsers();

    Result saveUser(User user);

    boolean existsByEmail(String email);

    User getByEmail(String email);





}
