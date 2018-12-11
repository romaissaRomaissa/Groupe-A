/**
 * 
 */
package org.mql.platform.business.projects;

import java.util.List;

import org.mql.platform.dao.ProjectRepository;
import org.mql.platform.models.Project;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sara
 *
 */

@Service
public class CrudProjectFacade {

	private final ProjectRepository projectRepository;

	public CrudProjectFacade(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}

	public Project getProjectById(Integer id) {
		return projectRepository.getOne(id);
	}

	@Transactional
	public boolean addOrUpdateProject(Project project) {
		return projectRepository.save(project) != null;
	}

	@Transactional
	public void deleteProjectById(Integer id) {
		projectRepository.deleteById(id);
	}

	@Transactional
	public void deleteProject(Project project) {
		projectRepository.delete(project);
	}
}
