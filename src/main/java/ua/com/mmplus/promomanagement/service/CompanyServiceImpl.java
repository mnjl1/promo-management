package ua.com.mmplus.promomanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.mmplus.promomanagement.domain.entity.Company;
import ua.com.mmplus.promomanagement.repository.CompanyRepository;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
	public void save(Company company) {
		companyRepository.save(company);
		
	}

    @Override
    public void delete(Long id) {
        companyRepository.deleteById(id);

    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company findById(Long id) {
        return companyRepository.getOne(id);
    }
    
}


