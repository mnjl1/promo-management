package ua.com.mmplus.promomanagement.service;

import java.util.List;

import ua.com.mmplus.promomanagement.domain.entity.Event;

public interface EventService {
	
	void save (Event event);
	
	void delete(Long id);
	
	List<Event> getAll();
	
	Event findById(Long id);
	
}
