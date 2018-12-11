/**
 * 
 */
package org.mql.platform.business.teams.impl;

import java.util.Optional;
import java.util.Set;

import org.mql.platform.business.teams.TeamService;
import org.mql.platform.dao.TeamRepository;
import org.mql.platform.models.Student;
import org.mql.platform.models.Team;
import org.mql.platform.models.TeamId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zouhair
 *
 */

@Service
public class DefaultTeamService implements TeamService {

	@Autowired
	TeamRepository teamRepository;

	public Optional<Team> createTeam(Team team) {
		return Optional.of(teamRepository.save(team));
	}

	public Optional<Team> createTeam(String name) {
		Team team = new Team();
		team.setName(name);
		return Optional.of(teamRepository.save(team));
	}

	public Optional<Team> createTeam(Set<Student> students, String name) {
		Team team = new Team();
		team.setName(name);
		team.setMembers(students);
		return Optional.of(teamRepository.save(team));
	}

	public void deleteTeam(TeamId id) {
		teamRepository.deleteById(id);
	}

	public Optional<Team> UpdateTeam(Team team) {
		return Optional.of(teamRepository.save(team));

	}

	public Optional<Team> selectTeam(TeamId id) {
		return Optional.of(teamRepository.getOne(id));
	}

	public boolean assignStudent(Student student, Team team) {
		Team t = teamRepository.getOne(team.getId());
		if (t != null) {
			t.getMembers().add(student);
			if(teamRepository.save(t) !=null)
				return true ;
		}
		return false;
	}

}
