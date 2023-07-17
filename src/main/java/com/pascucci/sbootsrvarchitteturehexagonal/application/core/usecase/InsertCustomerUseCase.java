package com.pascucci.sbootsrvarchitteturehexagonal.application.core.usecase;

import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Customer;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.in.InsertCustomerInputPort;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out.InsertCustomerOutputPort;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out.SendCpfForValidationOutputPort;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 InsertCustomerOutputPort insertCustomerOutputPort,
                                 SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        // inserir o cliente
        insertCustomerOutputPort.insert(customer);

        log.info("Envio para menssageria no Kafka para enviar uma mensagem de cpf para validação do cliente....{}",
                customer);
        sendCpfForValidationOutputPort.sendMessage(customer.getCpfNumber());

    }
}
