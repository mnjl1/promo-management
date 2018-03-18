package ua.com.mmplus.promomanagement.service;

import ua.com.mmplus.promomanagement.domain.entity.Company;
import java.util.List;

public interface CompanyService {

    void save(Company company);

    void delete(Long id);

    List<Company> getAll();

    Company findById(Long id);

    void update(Company company);

}
