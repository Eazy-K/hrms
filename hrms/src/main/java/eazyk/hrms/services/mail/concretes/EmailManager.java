package eazyk.hrms.services.mail.concretes;

import eazyk.hrms.services.mail.abstracts.EmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailManager implements EmailService {
    @Override
    public boolean mailSender(String email) {
        System.out.println(email);
        return true;
    }
}
