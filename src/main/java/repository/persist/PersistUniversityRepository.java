package repository.persist;

import domain.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collections;
import java.util.UUID;

public interface PersistUniversityRepository extends JpaRepository<University, UUID> {


}
