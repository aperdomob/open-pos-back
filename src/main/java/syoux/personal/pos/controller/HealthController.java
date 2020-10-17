package syoux.personal.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import syoux.personal.pos.service.ICityService;

@RestController
public class HealthController {
  @Autowired
  private ICityService cityService;

  @GetMapping("/")
  public String index() {
    var city = cityService.first();

    return "Hello! I'm running in " + city + " City.";
  }
}
