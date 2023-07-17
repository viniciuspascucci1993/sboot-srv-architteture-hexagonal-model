package com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.client.mapper;

import com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.client.response.AddressResponse;
import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
