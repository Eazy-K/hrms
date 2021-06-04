package eazyk.hrms.dataAccess.abstracts;


import eazyk.hrms.entitites.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

    List getByPositionIsActiveIsTrue();

    List getByPositionIsActiveIsTrueOrderByReleaseDAte();

    List getByPositionIsActiveIsTrueAndAndEmployersCompanyName(String companyName);









}
