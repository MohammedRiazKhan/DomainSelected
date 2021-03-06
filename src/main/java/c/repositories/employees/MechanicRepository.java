package c.repositories.employees;

import c.domain.employee.Mechanic;
import c.repositories.Repository;

import java.util.Set;

public interface MechanicRepository extends Repository<Mechanic, Integer> {

    Set<Mechanic>getAll();

}
