package com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out;

import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
