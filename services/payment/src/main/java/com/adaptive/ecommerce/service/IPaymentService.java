package com.adaptive.ecommerce.service;

import com.adaptive.ecommerce.dto.PaymentRequest;

public interface IPaymentService {

    Integer createPayment(PaymentRequest request);
}