package ua.com.mmplus.promomanagement.service;

import java.util.List;

import ua.com.mmplus.promomanagement.domain.entity.Promo;

public interface PromoService {
	
	void save(Promo promo);
	
	Promo findById(Long id);
	
	void delete(Long id);
	
	void update(Promo promo);
	
	List<Promo> getAll();

}
