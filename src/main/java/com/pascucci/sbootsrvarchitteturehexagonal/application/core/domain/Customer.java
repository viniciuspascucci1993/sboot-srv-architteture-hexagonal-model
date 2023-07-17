package com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain;

public class Customer {

    private String id;
    private String name;
    private String identificationCode;
    private String serialCustomerNumber;
    private String cpfNumber;
    private Address address;
    private Boolean isValidCpf;

    public Customer() {
        this.isValidCpf = false;
    }

    public Customer(String id, String name, String identificationCode, String serialCustomerNumber,
                    String cpfNumber, Address address, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.identificationCode = identificationCode;
        this.serialCustomerNumber = serialCustomerNumber;
        this.cpfNumber = cpfNumber;
        this.address = address;
        this.isValidCpf = isValidCpf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public String getSerialCustomerNumber() {
        return serialCustomerNumber;
    }

    public void setSerialCustomerNumber(String serialCustomerNumber) {
        this.serialCustomerNumber = serialCustomerNumber;
    }

    public String getCpfNumber() {
        return cpfNumber;
    }

    public void setCpfNumber(String cpfNumber) {
        this.cpfNumber = cpfNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getIsValidCpf() {
        return isValidCpf;
    }

    public void setIsValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
