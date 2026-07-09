package org.example.restfulapidesignswagger.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    // Boş Constructor (JPA için zorunlu)
    public Customer() {
    }

    // Parametreli Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter ve Setter Metodları
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}