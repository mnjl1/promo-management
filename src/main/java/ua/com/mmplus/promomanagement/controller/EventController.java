package ua.com.mmplus.promomanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ua.com.mmplus.promomanagement.domain.entity.Company;
import ua.com.mmplus.promomanagement.domain.entity.Event;
import ua.com.mmplus.promomanagement.domain.entity.Promo;
import ua.com.mmplus.promomanagement.domain.entity.Supermarket;
import ua.com.mmplus.promomanagement.repository.EventRepository;
import ua.com.mmplus.promomanagement.service.CompanyService;
import ua.com.mmplus.promomanagement.service.EventService;
import ua.com.mmplus.promomanagement.service.PromoService;
import ua.com.mmplus.promomanagement.service.SupermarketService;

import java.util.List;

@Controller
public class EventController {
	
	@Autowired
	EventRepository eventRepository;
	
	private EventService eventService;
	
	@Autowired
	public void setEventRepository(EventService eventService) {
		this.eventService = eventService;
	}

	@Autowired
	private CompanyService companyService;

	@Autowired
	private PromoService promoService;

	@Autowired
	private SupermarketService supermarketService;

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/event/add")
	public String eventForm(Model model) {
		model.addAttribute("event", new Event());

		List<Company> companies = companyService.getAll();
		model.addAttribute("companies", companies);

		List<Promo> promoList = promoService.getAll();
		model.addAttribute("promoList", promoList);

		List<Supermarket> supermarketList = supermarketService.getAll();
		model.addAttribute("supermarketList", supermarketList);

		return "eventform";	
	}
	
	@PostMapping("eventlist")
	public String eventSubmit(Event event) {
//		model.addAttribute("event", new Event());
//
//		model.addAttribute("event", event);

		//eventService.save(event);

		eventService.save(event);
		
		return "redirect:/";
	}
	
	@GetMapping("/eventlist")
	public String eventList(Model model) {
		model.addAttribute("events", eventService.getAll());
		return "eventlist";
	}
	
	@GetMapping("/event/update/{id}")
	public String updateEvent(Model model, @PathVariable(value="id") Long id) {
		model.addAttribute("event", eventService.findById(id));
		return "eventform";
	}
}
