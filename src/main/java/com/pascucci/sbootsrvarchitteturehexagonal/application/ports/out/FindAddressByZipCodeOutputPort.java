package com.pascucci.sbootsrvarchitteturehexagonal.application.ports.out;

import com.pascucci.sbootsrvarchitteturehexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
