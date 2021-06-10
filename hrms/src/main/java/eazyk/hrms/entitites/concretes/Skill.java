package eazyk.hrms.entitites.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "skills")
public class Skill {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id" )
    private int skillId;

    @Column(name ="programming_language" )
    private String programmingLanguage;

    @Column(name ="technologie" )
    private String technology;

    @ManyToOne(targetEntity = CV.class)
    @JoinColumn(name = "cv_id")
    private CV cv;
}
