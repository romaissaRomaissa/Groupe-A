package org.mql.platform.models;

import javax.persistence.Entity;

/**
 * @author mehdithe
 */
@Entity
public class News extends Publication {

	private NewsPriority priority;

	public News() {
	}

	public NewsPriority getPriority() {
		return priority;
	}

	public void setPriority(NewsPriority priority) {
		this.priority = priority;
	}

}
