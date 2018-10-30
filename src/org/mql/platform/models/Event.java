package org.mql.platform.models;

import java.util.List;

/**
 * @author mehdithe
 */
public class Event extends Publication {

  private List<String> guests;

  private List<String> organizers;

  public Event() {
  }

  public List<String> getGuests() {
    return guests;
  }

  public void setGuests(List<String> guests) {
    this.guests = guests;
  }

  public List<String> getOrganizers() {
    return organizers;
  }

  public void setOrganizers(List<String> organizers) {
    this.organizers = organizers;
  }
}
