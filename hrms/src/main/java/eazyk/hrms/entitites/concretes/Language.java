package eazyk.hrms.entitites.concretes;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Languages")
public class Language {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int languageId;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "language_level")
    @Range(min = 1, max = 5)
    private String languageLevel;


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(targetEntity = CV.class)
    @JoinColumn(name = "cv_id")
    private CV cv;




}
