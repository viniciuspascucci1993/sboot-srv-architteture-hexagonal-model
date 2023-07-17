package com.pascucci.sbootsrvarchitteturehexagonal.application.ports.in;

import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
