package org.mql.platform.models;

/**
 * @author mehdithe
 */
public enum Gender {

  MALE("Homme"),

  FEMALE("Femme");

  private String representation;

  Gender(String representation) {
    this.representation = representation;
  }

}
