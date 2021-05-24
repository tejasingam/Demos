package com.example;

public class InvalidAmountException extends RuntimeException {
    private String message;

    public InvalidAmountException(String message) {
        this.message=message;

    }

    @Override
    public String getMessage() {
        return message;
    }
}
