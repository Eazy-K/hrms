package eazyk.hrms.entitites.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import eazyk.hrms.entitites.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employers")
@PrimaryKeyJoinColumn(name = "user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisements"})
public class Employer extends User{



    @Column(name = "company_name")
    private String companyName;


    @Column(name = "web_page")
    private String webPage;


    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "employers")
    private List<JobAdvertisement> jobAdvertisements;
}
