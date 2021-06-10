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
@Table(name = "school")
public class School {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int schoolId;

    @Column(name = "description")
    private String description;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "department")
    private String department;

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
