package com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain;

public class Address {

    private String street;
    private String publicPlace;
    private String country;
    private String city;
    private String state;

    public Address() { }

    public Address(String street, String publicPlace, String country, String city, String state) {
        this.street = street;
        this.publicPlace = publicPlace;
        this.country = country;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
