package ua.com.mmplus.promomanagement.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "promo")
public class Promo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "promo_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "promo_name")
    private String promoName;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "promo")
    private Set<Event> eventList = new HashSet<>();

    public Promo() {
    }

    public Promo(String promoName) {
        this.promoName = promoName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
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
		result = prime * result + ((promoName == null) ? 0 : promoName.hashCode());
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
		Promo other = (Promo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (promoName == null) {
			if (other.promoName != null)
				return false;
		} else if (!promoName.equals(other.promoName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Promo{" +
				"id=" + id +
				", promoName='" + promoName + '\'' +
				", eventList=" + eventList +
				'}';
	}
}
