package org.mql.platform.models;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author mehdithe
 */
@Entity
public class Activity extends Publication {

	private String category;

	@ElementCollection
	private List<String> guests;

	@Temporal(TemporalType.DATE)
	Date activityDate;

	@Temporal(TemporalType.TIME)
	Date activityTime;

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

	public Date getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}

	public Date getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(Date activityTime) {
		this.activityTime = activityTime;
	}

}