package com.example.demo_REST_Exception.service;

import com.example.demo_REST_Exception.exception.NotEnoughMoneyException;
import com.example.demo_REST_Exception.model.dto.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        // Simuliamo che sul conto non ci siano abbastanza fondi
        throw new NotEnoughMoneyException();
    }


    public PaymentDetails processPaymentPayPall(){
        // Simuliamo che sul conto non ci siano abbastanza fondi
        throw new NotEnoughMoneyException();
    }
}
