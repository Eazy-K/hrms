package eazyk.hrms.entitites.concretes;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "work_experiences")
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_experience_id")
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


    @ManyToOne
    @JoinColumn(name = "curriculum_vitae_id")
    private CurriculumVitae curriculumVitae;


}
