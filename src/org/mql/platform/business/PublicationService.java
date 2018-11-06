package org.mql.platform.business;

import java.util.List;

import org.mql.platform.models.Activity;
import org.mql.platform.models.Event;
import org.mql.platform.models.News;

public interface PublicationService {
	public List<Activity> getAllActivities();
	public List<Event> getAllEvents();
	public List<News> getAllNews();
	
	public Activity getAvtivity(Long id);
	public Event getEvent(Long id);
	public News getNews(Long id);
	
	public boolean addOrUpdateActivity(Activity activity);
	public boolean addOrUpdateEvent(Event event);
	public boolean addOrUpdateNews(News news);
	
	public void deleteActivity(Long id);
	public void deleteEvent(Long id);
	public void deleteNews(Long id);
}
