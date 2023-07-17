package com.pascucci.sbootsrvarchitteturehexagonal.adapters.out;

import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out.SendCpfForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfForValidationAdapter implements SendCpfForValidationOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }
}
