package org.mql.platform.models;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author chermehdi
 * @author anouarma
 *
 * <pr>
 * PS: maybe the name experience is a reserved word in hibernate it caused problems, so we needed to
 * change the name of the table explicitely
 * </pr>
 */
@Entity
@Table(name = "MQL_EXPERIENCE")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Experience {

  @Id
  @GeneratedValue(generator = "experience", strategy = GenerationType.TABLE)
  protected Integer id;

  private String description;

  private LocalDate start;

  private LocalDate end;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getStart() {
    return start;
  }

  public void setStart(LocalDate start) {
    this.start = start;
  }

  public LocalDate getEnd() {
    return end;
  }

  public void setEnd(LocalDate end) {
    this.end = end;
  }

}
