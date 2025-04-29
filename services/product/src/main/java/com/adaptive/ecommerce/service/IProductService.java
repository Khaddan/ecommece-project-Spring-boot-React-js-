package com.adaptive.ecommerce.service;

import com.adaptive.ecommerce.dto.ProductPurchaseRequest;
import com.adaptive.ecommerce.dto.ProductPurchaseResponse;
import com.adaptive.ecommerce.dto.ProductRequest;
import com.adaptive.ecommerce.dto.ProductResponse;
import com.adaptive.ecommerce.exception.ProductPurchaseException;

import java.util.List;

public interface IProductService {

    Integer createProduct(ProductRequest request);

    ProductResponse findById(Integer id);

    List<ProductResponse> findAll();

    List<ProductPurchaseResponse> purchaseProducts(List<ProductPurchaseRequest> request) throws ProductPurchaseException;



}
