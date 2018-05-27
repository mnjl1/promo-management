package ua.com.mmplus.promomanagement.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.com.mmplus.promomanagement.domain.entity.Company;
import ua.com.mmplus.promomanagement.repository.CompanyRepository;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyServiceImplTest {

    @Autowired
    public CompanyService companyService;

    @Autowired
    public CompanyRepository companyRepository;

    @Test
    public void saveTest() {
        Company company = new Company();
        company.setCompanyName("Nestle");
        companyService.save(company);

        Company retrieveCompany = companyRepository.findByCompanyName("Nestle");

        assertThat(company.getCompanyName()).isEqualTo(retrieveCompany.getCompanyName());

    }
}
