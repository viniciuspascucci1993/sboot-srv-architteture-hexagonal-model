package com.pascucci.sbootsrvarchitteturehexagonal.application.core.usecase;

import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Customer;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer Not Found"));
    }
}
