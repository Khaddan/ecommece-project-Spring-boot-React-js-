package com.adaptive.ecommerce.connection.kafka;



import com.adaptive.ecommerce.connection.customer.CustomerResponse;
import com.adaptive.ecommerce.connection.product.PurchaseResponse;
import com.adaptive.ecommerce.entity.PaymentMethod;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
