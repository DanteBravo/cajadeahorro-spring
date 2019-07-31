package com.cajadeahorro.admin.models;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @Column(name = "clave")
    private Integer clave;
    @Column(name = "street")
    private String street;
    @Column(name = "postcode")
    private String postcode;
    @Column(name = "municipality")
    private String municipality;
    @Column(name = "neighborhood")
    private String neighborhod;

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getNeighborhod() {
        return neighborhod;
    }

    public void setNeighborhod(String neighborhod) {
        this.neighborhod = neighborhod;
    }
}
