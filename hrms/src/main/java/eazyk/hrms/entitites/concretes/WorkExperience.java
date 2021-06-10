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
@Table(name = "work_experiences")
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int workExperienceId;

    @Column(name = "company_Name")
    private String companyName;

    @Column(name = "job_position")
    private String jobPosition;

    @Column(name = "starting_Date")
    private Date startingDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "is_continue")
    private boolean isContinue;

    @ManyToOne(targetEntity = CV.class)
    @JoinColumn(name = "cv_id")
    private CV cv;


}
