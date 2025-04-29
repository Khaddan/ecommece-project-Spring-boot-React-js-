package com.adaptive.ecommerce.customer.repository;

import com.adaptive.ecommerce.customer.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String > {

}

