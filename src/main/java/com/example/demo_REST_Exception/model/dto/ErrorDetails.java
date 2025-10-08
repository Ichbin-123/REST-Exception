package com.example.demo_REST_Exception.model.dto;

// Il modello dei dati che restituiamo  in caso di errore
public class ErrorDetails {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}
