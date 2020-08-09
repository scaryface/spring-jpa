package domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Entity
public class University {

  @Id
  @NonNull
  @Getter
  @Setter
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  @Getter
  @Setter
  private String name;

  @OneToMany
  @Cascade(CascadeType.ALL)
  @Getter
  @Setter
  private List<College> colleges;


}
