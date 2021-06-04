package eazyk.hrms.entitites.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_advertisements")
public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_advertisement_id")
    private int jobAdvertisementIid;


    @Column(name = "job_desctription")
    private String jobDesctription;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "number_of_job_positions")
    private int numberOfJobPositions;

    @Column(name = "advertisement_release")
    private Date releaseDAte;

    @Column(name = "position_deadline")
    private Date positionDeadline;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City cities;

    @ManyToOne()
    @JoinColumn(name = "job_id")
    private Job jobs;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private Employer employers;




}
