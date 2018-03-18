package ua.com.mmplus.promomanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.mmplus.promomanagement.domain.entity.Supermarket;
import ua.com.mmplus.promomanagement.repository.SupermarketRepository;

@Service
public class SupermarketServiceImpl implements SupermarketService {
	
	@Autowired
	SupermarketRepository supermarketRepository;

	@Override
	public void save(Supermarket supermarket) {
		supermarketRepository.save(supermarket);
		
	}

	@Override
	public void delete(Long id) {
		supermarketRepository.deleteById(id);
		
	}

	@Override
	public List<Supermarket> getAll() {
		return supermarketRepository.findAll();
	}

	@Override
	public Supermarket findById(Long id) {
		return supermarketRepository.getOne(id);
	}

	@Override
	public void update(Supermarket supermarket) {
		// TODO Auto-generated method stub
		
	}
	
}
