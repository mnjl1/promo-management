package ua.com.mmplus.promomanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.com.mmplus.promomanagement.domain.entity.Company;
import ua.com.mmplus.promomanagement.service.CompanyService;

@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/companyform", method = RequestMethod.GET)
    public String companyForm(Model model){
        model.addAttribute("company", new Company());
        return "companyform";
    }

    @PostMapping("/companyform")
    public String companySubmit(Company company){

        String info = String.format("Company submission: id = %d, company = %s" +
                        ", email = %s", company.getId(), company.getCompanyName(),
                company.getCompanyEmail());
        logger.info(info);
        
        companyService.save(company);

        return "companyresult";
    }
    
    @GetMapping("/companylist")
    public String getCompanyList(Model model) {
    	model.addAttribute("companies", companyService.getAll());
    	return "companylist";
    }
    
    @GetMapping("/company/edit/{id}")
    public String updateCompany(@PathVariable(name = "id") Long id, Model model) {
    	model.addAttribute("company", companyService.findById(id));
    	return "companyform";
    }
}
