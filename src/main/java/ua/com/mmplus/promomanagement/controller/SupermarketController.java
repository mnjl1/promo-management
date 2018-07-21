package ua.com.mmplus.promomanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.mmplus.promomanagement.domain.entity.Supermarket;
import ua.com.mmplus.promomanagement.service.SupermarketService;

@Controller
public class SupermarketController {
	
	@Autowired
	private SupermarketService supermarketService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/supermarketform")
	public String supermarketForm(Model model) {
		model.addAttribute("supermarket", new Supermarket());
		return "supermarketform";	
	}
	
	@PostMapping("/supermarketform")
	public String supermarketSubmit(Supermarket supermarket) {
		String info = String.format("Supermarket submission id = %d, supermarket = %s",
				supermarket.getId(), supermarket.getSupermarketName());
		logger.info(info);
	
		supermarketService.save(supermarket);
		
		return "supermarketresult";
	}
	
	@GetMapping("/supermarketinfo")
	public String getSupermarket(@RequestParam("id") Long id, Model model) {
		Supermarket supermarket = supermarketService.findById(id);
		model.addAttribute("supermarket", supermarket);
		return "supermarketinfo";
	}
}
