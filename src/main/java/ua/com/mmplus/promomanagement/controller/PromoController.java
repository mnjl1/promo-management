package ua.com.mmplus.promomanagement.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ua.com.mmplus.promomanagement.domain.entity.Promo;
import ua.com.mmplus.promomanagement.service.PromoService;

@Controller
public class PromoController {
	
	@Autowired
	PromoService promoService;
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/promoform")
	public String promoForm(Model model) {
		model.addAttribute("promo", new Promo());
		
		return "promoform";
	}
	
	@PostMapping("/promoform")
	public String promoSubmit(Promo promo) {
		
		String info = String.format("Promo submission: id = %d,  promo = %s", promo.getId(), promo.getPromoName());
		logger.info(info);
		
		promoService.save(promo);
		
		return "promoresult";
	}
}
