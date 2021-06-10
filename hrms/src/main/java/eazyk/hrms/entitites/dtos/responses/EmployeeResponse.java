package eazyk.hrms.entitites.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse {

    private int id;

    private String firstName;

    private String lastName;

    private String jobDetail;

    private String email;



}
