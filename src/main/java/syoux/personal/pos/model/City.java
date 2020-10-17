package syoux.personal.pos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cities")
public class City {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Getter
  @Setter
  private Long id;

  @Getter
  @Setter
  private String name;

  public City() {

  }

  public City(Long id, String name) {
    this.id = id;
    this.name = name;
  }
}
