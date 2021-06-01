package eazyk.hrms.business.abstracts;

import eazyk.hrms.entitites.abstracts.User;

public interface CheckService {

    boolean isChecked(Long identificationNumber, String firstName, String lastName, int birthYear) throws Exception;


}
