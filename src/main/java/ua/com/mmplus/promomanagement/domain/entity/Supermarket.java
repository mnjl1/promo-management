package ua.com.mmplus.promomanagement.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "supermarket")
public class Supermarket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "supermarket_name")
    private String supermarketName;

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
}
