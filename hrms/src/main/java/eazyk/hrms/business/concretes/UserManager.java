package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.UserService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.dataAccess.abstracts.UserDao;
import eazyk.hrms.entitites.abstracts.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserManager implements UserService {


    private final UserDao userDao;


    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>( "Data Listelendi", this.userDao.findAll());
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi");
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


