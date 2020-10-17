package syoux.personal.pos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
  @GetMapping("/")
  public String index() {
    return "Hello! I'm running.";
  }
}
