package eazyk.hrms.entitites.concretes;

import eazyk.hrms.entitites.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employees")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employee extends User{



    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_page")
    private String webPage;

    @Column(name = "phone_number")
    private String phoneNumber;




}
