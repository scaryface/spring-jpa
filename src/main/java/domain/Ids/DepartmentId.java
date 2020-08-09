package domain.Ids;

import domain.Department;

import javax.persistence.IdClass;
import java.util.UUID;

@IdClass(Department.class)
public class DepartmentId {

  public String name;

  public UUID collegeId;
}
