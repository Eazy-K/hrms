package eazyk.hrms.dataAccess.abstracts;

import eazyk.hrms.entitites.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Integer> {

    City getByCityId(int cityId);

}
