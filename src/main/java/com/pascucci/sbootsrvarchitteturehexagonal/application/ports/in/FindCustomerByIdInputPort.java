package com.pascucci.sbootsrvarchitteturehexagonal.application.ports.in;

import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
