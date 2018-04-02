package ua.com.mmplus.promomanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ua.com.mmplus.promomanagement.domain.entity.Company;
import ua.com.mmplus.promomanagement.domain.entity.Event;
import ua.com.mmplus.promomanagement.domain.entity.Promo;
import ua.com.mmplus.promomanagement.domain.entity.Supermarket;
import ua.com.mmplus.promomanagement.service.CompanyService;
import ua.com.mmplus.promomanagement.service.EventService;
import ua.com.mmplus.promomanagement.service.PromoService;
import ua.com.mmplus.promomanagement.service.SupermarketService;

import java.util.List;

@Controller
public class EventController {
	
	@Autowired
	private EventService eventService;

	@Autowired
	private CompanyService companyService;

	@Autowired
	private PromoService promoService;

	@Autowired
	private SupermarketService supermarketService;

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/eventform")
	public String eventForm(Model model) {
		model.addAttribute("event", new Event());

		List<Company> companyList = companyService.getAll();
		List<Promo> promoList = promoService.getAll();
		List<Supermarket> supermarketList = supermarketService.getAll();

		return "eventform";	
	}
	
	@PostMapping("/eventform")
	public String eventSubmit(@ModelAttribute Event event, Model model) {
		model.addAttribute("event", new Event());



		eventService.save(event);

		return "eventresult";
	}
}
