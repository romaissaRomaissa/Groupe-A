package org.mql.platform.models;

/**
 * @author mehdithe
 */
public enum Language {

  FRENCH("francais"),

  ENGLISH("anglais"),

  SPANISH("espagnol");

  private String representation;

  Language(String representation) {
    this.representation = representation;
  }

  public String getRepresentation() {
    return representation;
  }
}
