package com.petmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private int id;
    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "id=" + id +
                ", country='" + country + '\'' +
                '}';
    }
}
