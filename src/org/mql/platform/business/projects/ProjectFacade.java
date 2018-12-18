package org.mql.platform.business.projects;

import java.util.Set;

import org.mql.platform.dao.ProjectRepository;
import org.mql.platform.dao.TeamRepository;
import org.mql.platform.models.Project;
import org.mql.platform.models.ProjectActivity;
import org.mql.platform.models.Team;
import org.springframework.stereotype.Service;

/**
 * @author chermehdi
 */
@Service
public class ProjectFacade {

  private final ProjectRepository projectRepository;

  private final TeamRepository teamRepository;

  public ProjectFacade(ProjectRepository projectRepository,
      TeamRepository teamRepository) {
    this.projectRepository = projectRepository;
    this.teamRepository = teamRepository;
  }

  Project findProject(Integer id) {
    return projectRepository.getOne(id);
  }
  
  /* Chaimae Elgaddar
   * This method helps to add a project to an activity of projects
   * the project and the projectActivity attributes should be retrieved from the database
   */
   boolean addProjectToActivity(Project project, ProjectActivity projectActivity) {
	 Set<Project> list = projectActivity.getProjects();
	 for (Project p : list) {
		if(p.getTitle().equals(project.getTitle())) {
			return false;
		}
	 }
	 list.add(project);
	 projectActivity.setProjects(list);
	 /* Chaimae Elgaddar
	  * This should be the method that updates the projectAcivity
	  * adding the new project
	  */
	 
	 // updateProjectActivity(projectActivity);
	 return true; 
  }
  
  /* Chaimae Elgaddar
   * This method helps affecting the team to its project
   */
   boolean affectTeamToProject(Team team, Project project) {
	  if(project.getTeam() == null) {
		  project.setTeam(team);
		  /* Chaimae Elgaddar
		   * This should be the method that updates the project
		   * adding the team
		   */
		  
		  //updateProject(project);
		  return true;
	  }
	  return false; 
  }
}
