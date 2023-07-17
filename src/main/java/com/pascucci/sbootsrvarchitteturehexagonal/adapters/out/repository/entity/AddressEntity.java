package com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.repository.entity;

import lombok.Data;

@Data

public class AddressEntity {

    private String street;
    private String publicPlace;
    private String country;
    private String city;
    private String state;
}
