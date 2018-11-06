package org.mql.platform.dao;

import org.mql.platform.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface ActivityRepository extends JpaRepository<Activity, Integer> {

}
// on peut redefinier les methodes de la classe mere
//findBy id, findBy ..
//repository. mais il n'existe

// personDao  --- personDaoRepository.
//mnt plus besoind de sa 
//intefger le type de l'identifiena de la classe'