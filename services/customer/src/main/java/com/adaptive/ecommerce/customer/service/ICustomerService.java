package com.adaptive.ecommerce.customer.service;

import com.adaptive.ecommerce.customer.dto.CustomerRequest;
import com.adaptive.ecommerce.customer.dto.CustomerResponse;

import java.util.List;

public interface ICustomerService {

    String createCustomer(CustomerRequest request);

    void updateCustomer(CustomerRequest request);

    List<CustomerResponse> findAllCustomers();

    CustomerResponse findById(String id);

    boolean existsById(String id);

    void deleteCustomer(String id);
}
