package com.adaptive.ecommerce.connection.payment;

import com.adaptive.ecommerce.connection.customer.CustomerResponse;
import com.adaptive.ecommerce.entity.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
