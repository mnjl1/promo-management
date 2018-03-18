package ua.com.mmplus.promomanagement.service;

import java.util.List;

import ua.com.mmplus.promomanagement.domain.entity.Supermarket;

public interface SupermarketService {
	void save(Supermarket supermarket);
	
	void delete(Long id);
	
	List<Supermarket> getAll();
	
	Supermarket findById(Long id);
	
	void update(Supermarket supermarket);
}
