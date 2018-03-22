package ua.com.mmplus.promomanagement.domain.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Event")
public class Event implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="promo_id")
    private Long id;
    private LocalDate date;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false)
    private Company company;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id", nullable=false)
    private Promo promoType;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id")
    private Supermarket supermarket;
    
    private String Description;
	public Event(Long id, Date date, Company company, Promo promoType, String description) {
		super();
		this.id = id;
		this.date = LocalDate.now();
		this.company = company;
		this.promoType = promoType;
		Description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Promo getPromoType() {
		return promoType;
	}
	public void setPromoType(Promo promoType) {
		this.promoType = promoType;
	}
	public Supermarket getSupermarket() {
		return supermarket;
	}
	public void setSupermarket(Supermarket supermarket) {
		this.supermarket = supermarket;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	

}
