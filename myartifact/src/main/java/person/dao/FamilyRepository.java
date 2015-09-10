package person.dao;


import person.models.Family;
import person.models.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by gbeuhler on 9/9/15.
 */
@RepositoryRestResource(collectionResourceRel = "family", path = "family")
public interface FamilyRepository extends PagingAndSortingRepository<Family, Long> {

    List<Person> findByLastName(@Param("last_name") String lastName);

}
