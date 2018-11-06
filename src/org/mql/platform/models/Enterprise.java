package org.mql.platform.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String city;

	private String adresse;

	@Column(unique = true)
	private String email;

	private String description;

	private String website;

	private String type;

	@OneToMany(mappedBy = "enterprise")
	private List<Internship> internships = new ArrayList<>();

	private String coordinator;

	private String phoneNumber;

	public Enterprise() {

	}

	public Enterprise(Integer id, String name, String city, String adresse, String email, String description,
			String website, String type, List<Internship> internships, String coordinator, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.adresse = adresse;
		this.email = email;
		this.description = description;
		this.website = website;
		this.type = type;
		this.internships = internships;
		this.coordinator = coordinator;
		this.phoneNumber = phoneNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Internship> getInternships() {
		return internships;
	}

	public void setInternships(List<Internship> internships) {
		this.internships = internships;
	}

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Enterprise [id=" + id + ", name=" + name + ", city=" + city + ", adresse=" + adresse + ", email="
				+ email + ", description=" + description + ", type=" + type + ", internships=" + internships
				+ ", phoneNumber=" + phoneNumber + "]";
	}

}
