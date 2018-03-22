package ua.com.mmplus.promomanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.mmplus.promomanagement.domain.entity.Event;
import ua.com.mmplus.promomanagement.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventRepository eventRepository;

	@Override
	public void save(Event event) {
		eventRepository.save(event);
		
	}

	@Override
	public void delete(Long id) {
		eventRepository.deleteById(id);
	}

	@Override
	public List<Event> getAll() {
		return eventRepository.findAll();
	}

	@Override
	public Event findById(Long id) {
		Event event = eventRepository.getOne(id);
		return event;
	}

	@Override
	public void update(Event event) {
		// TODO Auto-generated method stub
		
	}

}
