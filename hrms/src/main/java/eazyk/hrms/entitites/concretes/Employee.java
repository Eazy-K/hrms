package eazyk.hrms.entitites.concretes;

import eazyk.hrms.entitites.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employees")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employee extends User{



    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Column(name = "job_detail")
    private String jobDetail;







}
