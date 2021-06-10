package eazyk.hrms.entitites.dtos.requests;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeAddRequest {

    private String firstName;


    private String lastName;


    private String jobDetail;

    private String email;

    private String password;


}
