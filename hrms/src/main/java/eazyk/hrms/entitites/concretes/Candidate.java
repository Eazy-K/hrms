package eazyk.hrms.entitites.concretes;

import eazyk.hrms.entitites.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Candidates")
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User{



    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Column(name = "identification_number")
    private String identificationNumber;

    @NotNull
    @Column(name = "birthday")
    private String birthday;





}
