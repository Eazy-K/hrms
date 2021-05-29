package eazyk.hrms.entitites.concretes;

import eazyk.hrms.entitites.abstracts.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Employees")
public class Employee extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "job_detail")
    private String jobDetail;

    public Employee(int userId, String email, String password, boolean isVerify, int employeeId, String firstName, String lastName, String jobDetail) {
        super(userId, email, password, isVerify);
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobDetail = jobDetail;
    }


}
