package ua.com.mmplus.promomanagement.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import ua.com.mmplus.promomanagement.domain.entity.Promo;
import ua.com.mmplus.promomanagement.testconfig.TestConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration(classes = TestConfig.class)
public class PromoServiceTest {

    @Autowired
    private PromoService promoService;

    @Test
    public void saveNewPromoTest(){
        Promo promo = new Promo();
        promo.setId(1L);
        promo.setPromoName("GiftDay");

        promoService.save(promo);

        Promo retrievedPromo = this.promoService.findById(1L);

        assertThat(retrievedPromo).isEqualTo(promo);

    }



}
