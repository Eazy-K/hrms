package eazyk.hrms.entitites.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Curriculum_vitaes")
public class CV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id" )
    private int cvId;

    @Column(name ="cv_name" )
    private String cvName;

    @Column(name ="cover_letter" )
    private String coverLetter;

    @Column(name = "photo_name")
    private String photoName;

    @OneToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @OneToOne(targetEntity = SocialMedia.class)
    @JoinColumn(name = "social_media_id")
    private SocialMedia socialMedia;

    @OneToMany(targetEntity = Language.class)
    @JoinColumn(name = "language_id")
    private List<Language> languages;

    @OneToMany(mappedBy = "cv")
    private List<School> schools;

    @OneToMany(mappedBy = "cv")
    private List<Skill> skills;

    @OneToMany(mappedBy = "cv")
    private List<WorkExperience> workExperiences;


}
