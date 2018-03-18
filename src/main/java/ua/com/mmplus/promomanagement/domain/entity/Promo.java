package ua.com.mmplus.promomanagement.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "promo")
public class Promo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "promo_name")
    private String promoName;

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
    
    
}
