package org.mql.platform.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author mehdithe
 */
@Entity
public class Enterprise {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @OneToMany(mappedBy = "enterprise")
  private List<Internship> internships = new ArrayList<>();

  public Enterprise() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public List<Internship> getInternships() {
    return internships;
  }

  public void setInternships(List<Internship> internships) {
    this.internships = internships;
  }
}
