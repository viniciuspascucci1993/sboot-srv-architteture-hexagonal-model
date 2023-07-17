package com.pascucci.sbootsrvarchitteturehexagonal.application.core.usecase;

import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Customer;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.in.UpdateCustomerInputPort;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort,
                                 FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);

        updateCustomerOutputPort.update(customer);

    }
}
