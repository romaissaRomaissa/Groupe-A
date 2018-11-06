package org.mql.platform.business;

import java.util.List;

import org.mql.platform.models.Education;
import org.mql.platform.models.Experience;
import org.mql.platform.models.Laureate;
import org.mql.platform.models.Technology;

public interface CurriculumService {
	public Laureate getLaureate(Integer id);
	
	public List<Technology> getAllTechnologys();
	public List<Education> getAllEducations();
	public List<Experience> getAllExperiences();
	
	public Technology getTechnology(Integer id);
	public Education getEducation(Integer id);
	public Experience getExperience(Integer id);
	
	public boolean addOrUpdateTechnology(Technology technology);
	public boolean addOrUpdateEducation(Education education);
	public boolean addOrUpdateExperience(Experience experience);
	
	public void deleteTechnology(Integer id);
	public void deleteEducation(Integer id);
	public void deleteExperience(Integer id);
}
