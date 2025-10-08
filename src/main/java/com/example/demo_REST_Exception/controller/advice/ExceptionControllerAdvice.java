package com.example.demo_REST_Exception.controller.advice;

import com.example.demo_REST_Exception.exception.NotEnoughMoneyException;
import com.example.demo_REST_Exception.model.dto.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// Un punto centrale per la gestione delle eccezioni che vengono lanciate al controller rest

@RestControllerAdvice
public class ExceptionControllerAdvice {

    // Creiamo un metodo che scatta quando viene lanciata una NotEnoughMoneyException al controller
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> moneyHandler(NotEnoughMoneyException nemEx){
        // FIXME tornare il messaggio eccezione
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage(nemEx.getMessage());
        return ResponseEntity.badRequest().body(errorDetails);
    }
}
