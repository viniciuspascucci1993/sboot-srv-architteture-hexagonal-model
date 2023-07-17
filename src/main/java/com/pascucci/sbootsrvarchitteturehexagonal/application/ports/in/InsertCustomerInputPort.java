package com.pascucci.sbootsrvarchitteturehexagonal.application.ports.in;

import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
