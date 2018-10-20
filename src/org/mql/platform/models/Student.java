package org.mql.platform.models;

import java.util.Set;
import javax.persistence.Entity;

/**
 * @author mehdithe
 */
@Entity
public class Student {

  private Internship endOfStudiesProject;

  private Set<Module> modules;

  public Internship getEndOfStudiesProject() {
    return endOfStudiesProject;
  }

  public void setEndOfStudiesProject(Internship endOfStudiesProject) {
    this.endOfStudiesProject = endOfStudiesProject;
  }

  public Set<Module> getModules() {
    return modules;
  }

  public void setModules(Set<Module> modules) {
    this.modules = modules;
  }
}
