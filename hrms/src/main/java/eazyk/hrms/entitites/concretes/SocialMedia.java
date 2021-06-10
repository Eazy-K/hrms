package eazyk.hrms.entitites.concretes;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Social_media")
public class SocialMedia{


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int socialMediaId;

    @Column(name = "git_hub_link")
    private String gitHub;

    @Column(name = "linkedın_link")
    private String linkedIn;

  /*  @OneToOne()
    @JoinColumn(name = "cv_id")
    private CV cv;
*/
}
