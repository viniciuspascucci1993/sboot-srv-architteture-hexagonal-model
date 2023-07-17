package com.pascucci.sbootsrvarchitteturehexagonal.adapters.in.consumer.mapper;

import com.pascucci.sbootsrvarchitteturehexagonal.adapters.in.consumer.message.CustomerMessage;
import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
