package eazyk.hrms.business.concretes;

import eazyk.hrms.business.abstracts.AuthService;
import eazyk.hrms.business.abstracts.UserService;
import eazyk.hrms.core.utilities.result.ErrorResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.core.utilities.result.SuccessResult;
import eazyk.hrms.entitites.abstracts.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthManager implements AuthService {


    private final UserService userService;

    @Override
    public Result logIn(String email, String password) {
        if (!this.userService.existsByEmail(email)) {
            return new ErrorResult( "Kullanıcı bulunamadı.");
        }

        User user = this.userService.getByEmail(email);

        if(!user.getPassword().equals(password)){
            return new ErrorResult("Şifre hatalı");
        }

        //Verify kontrolü de burada gerçekleştirilecek

        return new SuccessResult("Giriş başarıyla gerçekleştirildi");
    }
}
