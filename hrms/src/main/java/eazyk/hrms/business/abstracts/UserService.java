package eazyk.hrms.business.abstracts;

import eazyk.hrms.entitites.abstracts.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User add(User user);




}
