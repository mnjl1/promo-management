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
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="event")
public class Event implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "event_id")
    private Long id;

	@Column(name = "creation_date") // date of event creation
    private LocalDate dateOfEvenCreation = LocalDate.now();
	

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="promo_id")
    private Promo promo;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="supermarket_id")
    private Supermarket supermarket;

    @Column(name = "description")
    private String description;

    @Column(name="status")
    private boolean status;

	public Event() {

	}

	public Event(Long id, LocalDate dateOfEvenCreation , Company company, Promo promo, String description, Boolean status) {
		super();
		this.id = id;
		this.dateOfEvenCreation = dateOfEvenCreation;
		this.company = company;
		this.promo = promo;
		this.description = description;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return dateOfEvenCreation;
	}
	public void setDate(LocalDate date) {
		this.dateOfEvenCreation = date;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Promo getPromo() {
		return promo;
	}
	public void setPromo(Promo promo) {
		this.promo = promo;
	}
	public Supermarket getSupermarket() {
		return supermarket;
	}
	public void setSupermarket(Supermarket supermarket) {
		this.supermarket = supermarket;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
