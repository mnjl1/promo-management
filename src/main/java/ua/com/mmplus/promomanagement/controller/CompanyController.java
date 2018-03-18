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

    @RequestMapping(value = "/companyform", method = RequestMethod.POST)
    public String companySubmit(@ModelAttribute Company company, Model model){

        model.addAttribute("company", company);

        String info = String.format("Company submission: id = %d, company = %s" +
                        ", email = %s", company.getId(), company.getCompanyName(),
                company.getCompanyEmail());
        logger.info(info);
        
        companyService.save(company);

        return "companyresult";
    }

    @GetMapping("/company_info")
    public String getCompany(@RequestParam("id") Long id, Model model){
        Company company = companyService.findById(id);
        model.addAttribute("company", company);
        return "company_info";
    }
}
