package repository.query;

import domain.College;
import domain.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.UUID;

public interface QueryUniversityRepository extends JpaRepository<University, UUID> {

  Collection<College> getAllByName(String name);


}
