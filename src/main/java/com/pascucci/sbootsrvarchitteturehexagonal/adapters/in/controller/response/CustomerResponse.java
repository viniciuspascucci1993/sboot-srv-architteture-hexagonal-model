package com.pascucci.sbootsrvarchitteturehexagonal.adapters.in.controller.response;

import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;
    private String identificationCode;
    private String serialCustomerNumber;
    private String cpfNumber;
    private Address address;
    private Boolean isValidCpf;
}
