package ua.com.mmplus.promomanagement.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "supermarket")
public class Supermarket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "supermarket_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "supermarket_name")
    private String supermarketName;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="supermarket")
    private Set<Event> eventList = new HashSet<>();

    public Supermarket() {
    }

    public Supermarket(String supermarketName) {
        this.supermarketName = supermarketName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupermarketName() {
        return supermarketName;
    }

    public void setSupermarketName(String supermarketName) {
        this.supermarketName = supermarketName;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((supermarketName == null) ? 0 : supermarketName.hashCode());
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
		Supermarket other = (Supermarket) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (supermarketName == null) {
			if (other.supermarketName != null)
				return false;
		} else if (!supermarketName.equals(other.supermarketName))
			return false;
		return true;
	}
	
	
    
    
}
