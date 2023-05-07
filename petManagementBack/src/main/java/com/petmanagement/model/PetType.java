package com.petmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "petTypes")
public class PetType {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private long id;
    private String petType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPetType() {
        return petType;
    }

    @Override
    public String toString() {
        return "PetType{" +
                "id=" + id +
                ", petType='" + petType + '\'' +
                '}';
    }
}
