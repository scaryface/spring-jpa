package domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import java.util.UUID;

@Entity
@EqualsAndHashCode(of={"name", "collegeId"})
public class Department {

  @Setter
  @Getter
  private String name;

  @JoinColumn
  @Setter
  @Getter
  private UUID collegeId;

}
