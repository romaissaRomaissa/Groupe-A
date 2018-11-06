package org.mql.platform.dao;

import org.mql.platform.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
//we can redefine methodes's mother class  
//findBy id, findBy ..
//repository
// personDao  ---> personDaoRepository.
//we don't need this anymore
//class and id of class