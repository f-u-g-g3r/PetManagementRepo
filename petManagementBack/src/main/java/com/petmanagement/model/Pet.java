package com.petmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Pets")
public class Pet {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String code;
    private String petType;
    private String furColor;
    private String country;
    private Long userid;

    public Pet() {}

    public Pet(String name, String code, String petType, String furColor, String country, Long userid) {
        this.name = name;
        this.code = code;
        this.petType = petType;
        this.furColor = furColor;
        this.country = country;
        this.userid = userid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getPetType() {
        return petType;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getCountry() {
        return country;
    }

    public Long getUserid() {
        return userid;
    }
}
