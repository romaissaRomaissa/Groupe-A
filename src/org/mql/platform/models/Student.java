package org.mql.platform.models;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 * @author mehdithe
 */
@Entity
public class Student extends User {

  @OneToOne
  private Internship endOfStudiesProject;

  @ManyToMany
  @JoinTable(
      name = "student_module",
      joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "module_id", referencedColumnName = "id")
  )
  private Set<Module> modules;

  @ManyToMany
  @JoinTable(
      name = "student_team",
      joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "team_id", referencedColumnName = "id")
  )
  private Set<Team> teams;

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
