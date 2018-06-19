package ua.com.mmplus.promomanagement.domain.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="event_date")
public class EventDate implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="event_date_id", nullable = false, updatable = false)
	private Long id;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	@Column(name="promo_event_date")
	private LocalDate eventDate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="event_id")
	private Event event;
	
	public EventDate() {
		
	}
	
	public EventDate(Long id, LocalDate eventDate, Event event) {
		super();
		this.id = id;
		this.eventDate = eventDate;
		this.event = event;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		EventDate other = (EventDate) obj;
		if (eventDate == null) {
			if (other.eventDate != null)
				return false;
		} else if (!eventDate.equals(other.eventDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
