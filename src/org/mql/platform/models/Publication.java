package org.mql.platform.models;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author mehdithe
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Publication {

  @Id
  @GeneratedValue(generator = "publication", strategy = GenerationType.TABLE)
  private Long id;

  @ManyToOne(optional = false)
  private User owner;

  @OneToMany
  @JoinColumn(name = "publication_id")
  private Set<Document> documents;

  private String title;

  private String description;

  private String location;

  @Temporal(TemporalType.DATE)
  private Date publicationDate;
  
  @Temporal(TemporalType.TIME)
  Date publicationTime;

  @Temporal(TemporalType.TIMESTAMP)
  Date creationDateTime;
  
  
  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  public Set<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(Set<Document> documents) {
    this.documents = documents;
  }

public Date getPublicationDate() {
	return publicationDate;
}

public void setPublicationDate(Date publicationDate) {
	this.publicationDate = publicationDate;
}

public Date getPublicationTime() {
	return publicationTime;
}

public void setPublicationTime(Date publicationTime) {
	this.publicationTime = publicationTime;
}

public Date getCreationDateTime() {
	return creationDateTime;
}

public void setCreationDateTime(Date creationDateTime) {
	this.creationDateTime = creationDateTime;
}
  
  
}
