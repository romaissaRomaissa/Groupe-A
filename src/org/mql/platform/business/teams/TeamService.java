/**
 * 
 */
package org.mql.platform.business.teams;

import java.util.Optional;
import java.util.Set;

import org.mql.platform.models.Student;
import org.mql.platform.models.Team;
import org.mql.platform.models.TeamId;

/**
 * @author zouhair
 *
 */
public interface TeamService {
	
	public Optional<Team> createTeam(Team team);

	public Optional<Team> createTeam(String name);

	public Optional<Team> createTeam(Set<Student> students, String name);

	public void deleteTeam(TeamId id);

	public Optional<Team> UpdateTeam(Team team);

	public Optional<Team> selectTeam(TeamId id);

	public boolean assignStudent(Student student, Team team);
}
