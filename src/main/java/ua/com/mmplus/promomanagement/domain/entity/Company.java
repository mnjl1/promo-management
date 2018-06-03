package ua.com.mmplus.promomanagement.domain.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "company_id")
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "email")
    private String companyEmail;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy="company")
    private Set<Event> eventList = new HashSet<>();

    public Company() {
    }

    public Company(Long id, String companyName, String companyEmail) {
        this.id=id;
        this.companyName = companyName;
        this.companyEmail = companyEmail;
    }

    public Company(String companyName, String companyEmail) {
        this.companyName = companyName;
        this.companyEmail = companyEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
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
		result = prime * result + ((companyEmail == null) ? 0 : companyEmail.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
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
		Company other = (Company) obj;
		if (companyEmail == null) {
			if (other.companyEmail != null)
				return false;
		} else if (!companyEmail.equals(other.companyEmail))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return getClass().getName()
				+"name="+companyName +"email=" +companyEmail;
	}
    
    
}
