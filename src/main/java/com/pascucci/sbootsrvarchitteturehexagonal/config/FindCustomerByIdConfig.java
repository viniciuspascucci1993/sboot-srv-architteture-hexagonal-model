package com.pascucci.sbootsrvarchitteturehexagonal.config;

import com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.FindCustomerByIdAdapter;
import com.pascucci.sbootsrvarchitteturehexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
