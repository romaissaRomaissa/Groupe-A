package org.mql.platform.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author mehdithe
 */
@Entity
public class Internship extends Experience {

  @OneToOne(mappedBy = "endOfStudiesProject")
  private Student student;

  @ManyToOne
  private Enterprise enterprise;

  public Internship() {
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Enterprise getEnterprise() {
    return enterprise;
  }

  public void setEnterprise(Enterprise enterprise) {
    this.enterprise = enterprise;
  }
}
