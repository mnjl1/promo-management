package ua.com.mmplus.promomanagement.service;

import java.util.List;

import ua.com.mmplus.promomanagement.domain.entity.EventDate;

public interface EventDateService {
	
	void save(EventDate eventDate);
	
	void delete(Long id);
	
	List<EventDate> getAll();
	
	EventDate findById(Long Id);
	

}
