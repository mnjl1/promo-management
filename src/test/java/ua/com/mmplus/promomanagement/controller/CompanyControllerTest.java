package ua.com.mmplus.promomanagement.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import ua.com.mmplus.promomanagement.service.CompanyService;

@RunWith(SpringRunner.class)
@WebMvcTest(CompanyController.class)
public class CompanyControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private CompanyService companyService;
	
	@InjectMocks
	private CompanyController companyController;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	

}
