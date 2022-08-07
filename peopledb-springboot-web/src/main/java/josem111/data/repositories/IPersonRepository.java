package josem111.data.repositories;

import josem111.biz.models.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @CrudRepository:
 * An interface for generic CRUD operations on a repository for a specific type.
 * (Object)->Author: Oliver Gierke, Eberhard Wolff, Jens Schauder
 * Type parameters:
 * <T> – the domain type the repository manages
 * <ID> – the type of the id of the entity the repository manages
 */
@Repository
public interface IPersonRepository extends CrudRepository<PersonEntity, Long> {

}
