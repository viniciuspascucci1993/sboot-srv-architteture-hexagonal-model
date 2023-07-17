package com.pascucci.sbootsrvarchitteturehexagonal.config;

import com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.UpdateCustomerAdapter;
import com.pascucci.sbootsrvarchitteturehexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.pascucci.sbootsrvarchitteturehexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
        FindCustomerByIdUseCase findCustomerByIdUseCase,
        FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
        UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
