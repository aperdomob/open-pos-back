package syoux.personal.pos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import syoux.personal.pos.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
