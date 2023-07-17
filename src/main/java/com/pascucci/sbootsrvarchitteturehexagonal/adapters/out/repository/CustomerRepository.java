package com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.repository;

import com.pascucci.sbootsrvarchitteturehexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
