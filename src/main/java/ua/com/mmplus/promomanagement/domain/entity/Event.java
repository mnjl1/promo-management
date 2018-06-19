package ua.com.mmplus.promomanagement.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="event")
public class Event implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "event_id", nullable = false, updatable = false)
    private Long id;

	@Column(name = "creation_date") // date of event object creation
    private LocalDate dateOfEvenCreation = LocalDate.now();
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="event")
	private Set<EventDate> eventDateList = new HashSet<>();
	
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
    private String eventDescription;

    @Column(name="status")
    private boolean status;

	public Event() {
	}

	public Event(Long id, LocalDate dateOfEvenCreation, Set<EventDate> eventDateList, Company company, Promo promo,
			Supermarket supermarket, String description, boolean status) {
		super();
		this.id = id;
		this.dateOfEvenCreation = dateOfEvenCreation;
		this.eventDateList = eventDateList;
		this.company = company;
		this.promo = promo;
		this.supermarket = supermarket;
		this.eventDescription = description;
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
		return eventDescription;
	}
	public void setDescription(String description) {
		this.eventDescription = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

	public Set<EventDate> getEventDateList() {
		return eventDateList;
	}

	public void setEventDateList(Set<EventDate> eventDateList) {
		this.eventDateList = eventDateList;
	}

	public LocalDate getDateOfEvenCreation() {
		return dateOfEvenCreation;
	}

	public void setDateOfEvenCreation(LocalDate dateOfEvenCreation) {
		this.dateOfEvenCreation = dateOfEvenCreation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((dateOfEvenCreation == null) ? 0 : dateOfEvenCreation.hashCode());
		result = prime * result + ((eventDescription == null) ? 0 : eventDescription.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((promo == null) ? 0 : promo.hashCode());
		result = prime * result + (status ? 1231 : 1237);
		result = prime * result + ((supermarket == null) ? 0 : supermarket.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (dateOfEvenCreation == null) {
			if (other.dateOfEvenCreation != null)
				return false;
		} else if (!dateOfEvenCreation.equals(other.dateOfEvenCreation))
			return false;
		if (eventDescription == null) {
			if (other.eventDescription != null)
				return false;
		} else if (!eventDescription.equals(other.eventDescription))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (promo == null) {
			if (other.promo != null)
				return false;
		} else if (!promo.equals(other.promo))
			return false;
		if (status != other.status)
			return false;
		if (supermarket == null) {
			if (other.supermarket != null)
				return false;
		} else if (!supermarket.equals(other.supermarket))
			return false;
		return true;
	}
	
	
}
