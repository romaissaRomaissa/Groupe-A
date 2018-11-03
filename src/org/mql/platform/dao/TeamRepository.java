package org.mql.platform.dao;

import org.mql.platform.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
