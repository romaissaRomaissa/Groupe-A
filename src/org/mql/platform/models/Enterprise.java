package org.mql.platform.models;

import java.util.List;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author YassirSalih
 */
@Entity
public class Enterprise {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String city ;
  private String adresse;
  
  @Column(unique=true)
  private String email;
  
  private String description;
  private String webSite;
  private String type;
  
  @OneToMany(targetEntity=Internship.class ,
      fetch =FetchType.EAGER, cascade=CascadeType.ALL, mappedBy="enterprise")
  private List<Internship> internShips = new Vector<>();
  
  private String coordinator;
  private Integer phoneNumber ;
  
  
  public Enterprise() {
    
  }


  public Enterprise(Long id, String name, String city, String adresse, String email, String description,
      String webSite, String type, List<Internship> internShips, String coordinator, Integer phoneNumber) {
    super();
    this.id = id;
    this.name = name;
    this.city = city;
    this.adresse = adresse;
    this.email = email;
    this.description = description;
    this.webSite = webSite;
    this.type = type;
    this.internShips = internShips;
    this.coordinator = coordinator;
    this.phoneNumber = phoneNumber;
  }


  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public String getAdresse() {
    return adresse;
  }


  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }


  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public String getWebSite() {
    return webSite;
  }


  public void setWebSite(String webSite) {
    this.webSite = webSite;
  }


  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public List<Internship> getInternShips() {
    return internShips;
  }


  public void setInternShips(List<Internship> internShips) {
    this.internShips = internShips;
  }


  public String getCoordinator() {
    return coordinator;
  }


  public void setCoordinator(String coordinator) {
    this.coordinator = coordinator;
  }


  public Integer getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(Integer phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public String toString() {
    return "Enterprise [id=" + id + ", name=" + name + ", city=" + city + ", adresse=" + adresse + ", email="
        + email + ", description=" + description + ", webSite=" + webSite + ", type=" + type + ", internShips="
        + internShips + ", coordinator=" + coordinator + ", phoneNumber=" + phoneNumber + "]";
  }
  
  
  


}
