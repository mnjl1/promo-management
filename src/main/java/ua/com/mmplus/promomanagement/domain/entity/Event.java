package ua.com.mmplus.promomanagement.domain.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


public class PromoEvent implements Serializable {
    private Long id;
    private LocalDate date;
    private Company company;
    private Promo promoType;
    private String Description;
	public PromoEvent(Long id, Date date, Company company, Promo promoType, String description) {
		super();
		this.id = id;
		this.date = LocalDate.now();
		this.company = company;
		this.promoType = promoType;
		Description = description;
	}
	
	
	
	
    
    
    
    


}
