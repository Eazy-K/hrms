package eazyk.hrms.entitites.dtos.requests;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CandidateAddRequest {

    private String firstName;

    private String lastName;

    private String identificationNumber;

    private String birthday;

    private String email;

    private String password;


}
