package org.mql.platform.models;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author mehdithe
 */
@Entity
public class Curriculum {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @OneToMany
  private Set<Technology> technologies;

  @OneToMany
  private Set<Education> eduction;

  @OneToMany
  private Set<Experience> experiences;

  public Curriculum() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Set<Technology> getTechnologies() {
    return technologies;
  }

  public void setTechnologies(Set<Technology> technologies) {
    this.technologies = technologies;
  }

  public Set<Education> getEduction() {
    return eduction;
  }

  public void setEduction(Set<Education> eduction) {
    this.eduction = eduction;
  }

  public Set<Experience> getExperiences() {
    return experiences;
  }

  public void setExperiences(Set<Experience> experiences) {
    this.experiences = experiences;
  }
}
