package syoux.personal.pos.controller.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import syoux.personal.pos.service.ICityService;

@RestController
public class HealthController {
  @Autowired
  private ICityService cityService;

  @GetMapping("/")
  public HealthResponse index() {
    var body = new HealthResponse();
    body.setMessage("Hello! I'm running in " + cityService.first() + " City.");

    return body;
  }
}
