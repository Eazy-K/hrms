package eazyk.hrms.entitites.concretes;

import eazyk.hrms.entitites.abstracts.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Employers")
public class Employer extends User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_page")
    private String webPage;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Employer(int userId, String email, String password, boolean isVerify, int employerId, String companyName, String webPage, String phoneNumber) {
        super(userId, email, password, isVerify);
        this.employerId = employerId;
        this.companyName = companyName;
        this.webPage = webPage;
        this.phoneNumber = phoneNumber;
    }
}
