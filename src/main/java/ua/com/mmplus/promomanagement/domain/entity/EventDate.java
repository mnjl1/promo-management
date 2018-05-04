package ua.com.mmplus.promomanagement.domain.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="event_date")
public class EventDate {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="eventDate_id")
	private Long id;
	
	@Column(name="eventDate")
	private Date eventDate;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "event_date")
	private Set<Event> eventList = new HashSet<>();
	
	public EventDate() {
		
	}
	
	public EventDate(Long id, Date eventDate, Set<Event> eventList) {
		super();
		this.id = id;
		this.eventDate = eventDate;
		this.eventList = eventList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public Set<Event> getEventList() {
		return eventList;
	}

	public void setEventList(Set<Event> eventList) {
		this.eventList = eventList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
		result = prime * result + ((eventList == null) ? 0 : eventList.hashCode());
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
		if (eventList == null) {
			if (other.eventList != null)
				return false;
		} else if (!eventList.equals(other.eventList))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
