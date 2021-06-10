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
@Table(name = "Candidates")
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User{


    @Column(name = "first_name")
    private String firstName;


    @Column(name = "last_name")
    private String lastName;


    @Column(name = "identification_number")
    private String identificationNumber;


    @Column(name = "birthday")
    private String birthday;

    @OneToOne(mappedBy = "candidate")
    private CV cv;


}
