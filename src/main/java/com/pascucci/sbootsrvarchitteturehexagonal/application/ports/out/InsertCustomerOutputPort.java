package com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out;

import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
