package eazyk.hrms.entitites.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDtoGet {

    private int userId;

    private String firstName;


    private String lastName;


    private String jobDetail;

    private String email;



}
