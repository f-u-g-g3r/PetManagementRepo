package com.petmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "furColors")
public class FurColor {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private int id;
    private String furColor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFurColor() {
        return furColor;
    }

    @Override
    public String toString() {
        return "PetFurColor{" +
                "id=" + id +
                ", furColor='" + furColor + '\'' +
                '}';
    }
}
