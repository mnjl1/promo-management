package ua.com.mmplus.promomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.mmplus.promomanagement.domain.entity.Promo;

@Repository
public interface PromoRepository extends JpaRepository<Promo, Long> {
}
