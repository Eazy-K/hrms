package eazyk.hrms.entitites.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployerDto {

    int id;

    private String companyName;

    private String webPage;

    private String phoneNumber;




}
