package lee.zac.repository;

import lee.zac.model.TimeCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*** Created by zaclee on 10/26/16. ***/

@Repository
public interface TimeCardDAO extends JpaRepository<TimeCard, Long> {

    List<TimeCard> findById(@Param("id") Long id);
}
