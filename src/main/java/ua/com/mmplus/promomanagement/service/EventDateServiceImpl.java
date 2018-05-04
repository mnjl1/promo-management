package ua.com.mmplus.promomanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.com.mmplus.promomanagement.domain.entity.EventDate;
import ua.com.mmplus.promomanagement.repository.EventDateRepository;

public class EventDateServiceImpl implements EventDateService {
	
	@Autowired
	EventDateRepository eventDateRepository;

	@Override
	public void save(EventDate eventDate) {
		eventDateRepository.save(eventDate);
	}

	@Override
	public void delete(Long id) {
		eventDateRepository.deleteById(id);
	}

	@Override
	public List<EventDate> getAll() {
		return eventDateRepository.findAll();
	}

	@Override
	public EventDate findById(Long Id) {
		return eventDateRepository.getOne(Id);
	}

}
