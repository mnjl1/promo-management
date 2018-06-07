package ua.com.mmplus.promomanagement.testconfig;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import ua.com.mmplus.promomanagement.service.PromoService;
import ua.com.mmplus.promomanagement.service.PromoServiceImpl;

@TestConfiguration
public class TestConfig {

    @Bean
    public PromoService promoService(){

        return new PromoServiceImpl();
    }

}
