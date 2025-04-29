package com.adaptive.ecommerce.service;

import com.adaptive.ecommerce.connection.notification.NotificationProducer;
import com.adaptive.ecommerce.connection.notification.PaymentNotificationRequest;
import com.adaptive.ecommerce.dto.PaymentRequest;
import com.adaptive.ecommerce.mapper.PaymentMapper;
import com.adaptive.ecommerce.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService implements IPaymentService{

    private final PaymentRepository repository;
    private final PaymentMapper mapper;
    private final NotificationProducer notificationProducer;

    public Integer createPayment(PaymentRequest request) {
        var payment = this.repository.save(this.mapper.toPayment(request));

        this.notificationProducer.sendNotification(
                new PaymentNotificationRequest(
                        request.orderReference(),
                        request.amount(),
                        request.paymentMethod(),
                        request.customer().firstname(),
                        request.customer().lastname(),
                        request.customer().email()
                )
        );
        return payment.getId();
    }
}
