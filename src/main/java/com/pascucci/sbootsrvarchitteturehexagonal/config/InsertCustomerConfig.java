package com.pascucci.sbootsrvarchitteturehexagonal.config;

import com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.SendCpfForValidationAdapter;
import com.pascucci.sbootsrvarchitteturehexagonal.application.core.usecase.InsertCustomerUseCase;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out.InsertCustomerOutputPort;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out.SendCpfForValidationOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerOutputPort insertCustomerOutputPort,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter,
                insertCustomerOutputPort, sendCpfForValidationAdapter);
    }
}
