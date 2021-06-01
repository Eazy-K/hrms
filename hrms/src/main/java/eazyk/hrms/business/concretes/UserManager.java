package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.UserService;
import eazyk.hrms.dataAccess.abstracts.UserDao;
import eazyk.hrms.entitites.abstracts.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getAll() {
        return this.userDao.findAll();
    }

    @Override
    public User add(User user) {
        return this.userDao.save(user);
    }

    @Override
    public boolean existsByEmail(String email) {
        return this.userDao.existsByEmail(email);
    }

    @Override
    public User getByEmail(String email) {
        return this.userDao.getByEmail(email);
    }


}


