package lee.zac.repository;

import lee.zac.model.TimeCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*** Created by zaclee on 10/26/16. ***/

@Repository
public interface TimeCardDAO extends CrudRepository<TimeCard, Long> {
}
