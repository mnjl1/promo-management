package ua.com.mmplus.promomanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ua.com.mmplus.promomanagement.domain.entity.Event;
import ua.com.mmplus.promomanagement.service.EventService;

@Controller
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping("/eventform")
	public String eventForm(Model model) {
		model.addAttribute("event", new Event());
		return "eventform";	
	}
	
	@PostMapping("/eventform")
	public String eventSubmit(@ModelAttribute Event event, Model Model) {
		
		return "eventresult";
	}
}
