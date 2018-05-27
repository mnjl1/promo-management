package ua.com.mmplus.promomanagement.domain.entity.profile;

import javax.persistence.*;

@Entity
@Table(name = "main_profile")
@Inheritance(strategy = InheritanceType.JOINED)
public class MainProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "main_profile_id")
    private Long id;

    @Column(name = "validation_key")
    private Long validationKey;

    @Column(name = "first_name")
    private String fistName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Transient
    @Column(name = "password")
    private String password;

    @Column(name = "encrypted_password")
    private String encryptedPassword;

    public MainProfile() {
    }

    public MainProfile(Long validationKey, String fistName, String lastName, String email, String password, String encryptedPassword) {
        this.validationKey = validationKey;
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.encryptedPassword = encryptedPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValidationKey() {
        return validationKey;
    }

    public void setValidationKey(Long validationKey) {
        this.validationKey = validationKey;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    @Override
    public String toString() {
        return "MainProfile{" +
                "id=" + id +
                ", validationKey=" + validationKey +
                ", fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", encryptedPassword='" + encryptedPassword + '\'' +
                '}';
    }
}
