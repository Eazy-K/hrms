package eazyk.hrms.entitites.dtos.requests;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployerAddRequest {


    private String companyName;

    private String webPage;

    private String phoneNumber;

    private String email;

    private String password;


}
