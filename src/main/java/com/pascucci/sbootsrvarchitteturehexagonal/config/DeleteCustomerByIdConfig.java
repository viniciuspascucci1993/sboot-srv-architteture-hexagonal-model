package com.pascucci.sbootsrvarchitteturehexagonal.config;

import com.pascucci.sbootsrvarchitteturehexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.pascucci.sbootsrvarchitteturehexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdOutputPort);
    }

}
