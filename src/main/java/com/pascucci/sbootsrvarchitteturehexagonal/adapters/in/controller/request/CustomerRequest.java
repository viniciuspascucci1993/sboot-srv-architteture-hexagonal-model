package com.pascucci.sbootsrvarchitteturehexagonal.adapters.in.controller.request;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {

    @NotBlank(message = "Name is Required!")
    private String name;

    @NotBlank(message = "Identification Code is Required!")
    private String identificationCode;

    @NotBlank(message = "Serial Customer Number is Required!")
    private String serialCustomerNumber;

    @NotBlank(message = "CPF is Required!")
    private String cpfNumber;

    @NotBlank(message = "Zip Code is Required!")
    private String zipCode;
}
