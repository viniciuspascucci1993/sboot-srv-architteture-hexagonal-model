package com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "tb_customers")
public class CustomerEntity {

    @Id
    private String id;
    private String name;
    private String identificationCode;
    private String serialCustomerNumber;
    private String cpfNumber;
    private AddressEntity address;
    private Boolean isValidCpf;
}
