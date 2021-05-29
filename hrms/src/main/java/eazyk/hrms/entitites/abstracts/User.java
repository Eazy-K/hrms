package eazyk.hrms.entitites.abstracts;


import eazyk.hrms.entitites.concretes.Candidate;
import eazyk.hrms.entitites.concretes.Employer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "email" )
    private String email;

    @Column(name = "password" )
    private String password;

    @Column(name = "is_verify" )
    private  boolean isVerify;








}
