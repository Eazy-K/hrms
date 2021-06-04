package eazyk.hrms.entitites.dtos;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CandidateDtoAdd {

    private String firstName;

    private String lastName;

    private String identificationNumber;

    private String birthday;

    private String email;

    private String password;


}
