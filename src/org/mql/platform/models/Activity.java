package org.mql.platform.models;

import java.util.List;
import javax.persistence.Entity;

/**
 * @author mehdithe
 */
@Entity
public class Activity extends Publication {

  private String category;

  private List<String> guests;

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public List<String> getGuests() {
    return guests;
  }

  public void setGuests(List<String> guests) {
    this.guests = guests;
  }

}