package eazyk.hrms.dataAccess.abstracts;


import eazyk.hrms.entitites.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;



public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {







}
