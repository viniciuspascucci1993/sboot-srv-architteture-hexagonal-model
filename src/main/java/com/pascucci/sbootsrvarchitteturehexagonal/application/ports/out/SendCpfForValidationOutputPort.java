package com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out;

public interface SendCpfForValidationOutputPort {

    void sendMessage(String cpf);
}
