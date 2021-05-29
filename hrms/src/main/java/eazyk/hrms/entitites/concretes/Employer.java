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
@Table(name = "Employers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User{


    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;*/

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_page")
    private String webPage;

    @Column(name = "phone_number")
    private String phoneNumber;




}
