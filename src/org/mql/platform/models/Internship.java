package org.mql.platform.models;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author mehdithe
 */

@Entity
public class Internship extends Experience {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id ;
  private String subject ;
  
  @ManyToOne(fetch = FetchType.EAGER , cascade=CascadeType.ALL)
  private Student student ;
  
  @ManyToOne(fetch =FetchType.EAGER)
  @JoinColumn(name="enterprise_id")
    private Enterprise enterprise;
  
    private String framing; 
    private boolean remuneration;
    private boolean preEmployment;
    private String job ;
    
    @Lob
    private List<String>technologies = new Vector<>();
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate ;
    
    public Internship() {
    student = new Student();
    enterprise = new Enterprise();
  }
    
    

  public Internship(Long id, String subject, Student student, Enterprise enterprise,
      List<String> technologies, Date startDate, Date endDate) {
    super();
    this.id = id;
    this.subject = subject;
    this.student = student;
    this.enterprise = enterprise;
    this.technologies = technologies;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
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

  public String getFraming() {
    return framing;
  }

  public void setFraming(String framing) {
    this.framing = framing;
  }

  public boolean isRemuneration() {
    return remuneration;
  }

  public void setRemuneration(boolean remuneration) {
    this.remuneration = remuneration;
  }

  public boolean isPreEmployment() {
    return preEmployment;
  }

  public void setPreEmployment(boolean preEmployment) {
    this.preEmployment = preEmployment;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public List<String> getTechnologies() {
    return technologies;
  }

  public void setTechnologies(List<String> technologies) {
    this.technologies = technologies;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return "Internship [id=" + id +
        ", subject=" + subject +
        ", student=" + student +
        ", enterprise=" + enterprise+ "]";
  }
}
