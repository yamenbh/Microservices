package com.aitelbhiri.entities;

import com.aitelbhiri.entities.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marque;
    private String matricule;
    private String model;

    @Column(name = "id_client")  // Make sure this annotation is present
    private Long id_client;

    @Transient
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    public Long getClientId() {
        return id_client;
    }

    public void setClientId(Long id_client) {
        this.id_client = id_client;
    }


    // Other methods and getters/setters
}
