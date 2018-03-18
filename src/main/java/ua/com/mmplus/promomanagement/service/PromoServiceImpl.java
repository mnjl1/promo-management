package ua.com.mmplus.promomanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.mmplus.promomanagement.domain.entity.Promo;
import ua.com.mmplus.promomanagement.repository.PromoRepository;

@Service
public class PromoServiceImpl implements PromoService {
	
	@Autowired
	PromoRepository promoRepository;
	

	@Override
	public void save(Promo promo) {
		promoRepository.save(promo);
		
	}

	@Override
	public Promo findById(Long id) {
		return promoRepository.getOne(id);
	}

	@Override
	public void delete(Long id) {
		Promo promo = promoRepository.getOne(id);
		promoRepository.delete(promo);
	
	}

	@Override
	public void update(Promo promo) {
		promoRepository.save(promo);		
	}

	@Override
	public List<Promo> getAll() {
		return promoRepository.findAll();
	}
	
	
	
}
