package eazyk.hrms.entitites.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "Jobs")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisements"})
public class Job {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private int jobId;


    @NotNull
    @Column(name = "job_name")
    private String jobName;


    @OneToMany(mappedBy = "jobs")
    private List<JobAdvertisement> jobAdvertisements;






}
