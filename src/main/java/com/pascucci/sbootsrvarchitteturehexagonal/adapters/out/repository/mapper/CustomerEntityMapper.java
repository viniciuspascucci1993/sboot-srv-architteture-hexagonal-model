package com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.repository.mapper;

import com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.repository.entity.CustomerEntity;
import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
