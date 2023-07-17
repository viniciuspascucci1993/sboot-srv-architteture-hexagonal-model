package com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.client.response;

import lombok.Data;

@Data
public class AddressResponse {

    private String street;
    private String publicPlace;
    private String country;
    private String city;
    private String state;
}
