package syoux.personal.pos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import syoux.personal.pos.model.City;
import syoux.personal.pos.repository.CityRepository;

@Service
public class CityService implements ICityService{
  @Autowired
  private CityRepository repository;

  @Override
  public String first() {
    var cities = (List<City>) repository.findAll();

    return cities.get(0).getName();
  }
}
