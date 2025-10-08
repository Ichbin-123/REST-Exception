package com.example.demo_REST_Exception.controller;

import com.example.demo_REST_Exception.exception.NotEnoughMoneyException;
import com.example.demo_REST_Exception.model.dto.ErrorDetails;
import com.example.demo_REST_Exception.model.dto.PaymentDetails;
import com.example.demo_REST_Exception.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    // ? vuol dire che possiamo tornare qualsiasi oggetto come
    // body della risposta HTTP
    public ResponseEntity<PaymentDetails> makePayment() {

        PaymentDetails paymentDetails = paymentService.processPayment();
        return ResponseEntity.ok(paymentDetails); // ok è una scorciatoia per status ok


    }

    @PostMapping("/paymentPayPal")
    public ResponseEntity<PaymentDetails> makePaymentPayPal(){

        PaymentDetails paymentDetails = paymentService.processPaymentPayPall();
        return ResponseEntity.ok(paymentDetails); // ok è una scorciatoia per status ok

    }
}
