package domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class College {

  @Id
  @NonNull
  @Getter
  @Setter
  private UUID id;

  @Getter
  @Setter
  private String name;


}
