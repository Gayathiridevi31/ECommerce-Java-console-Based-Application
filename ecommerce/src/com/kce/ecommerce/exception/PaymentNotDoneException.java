package com.kce.ecommerce.exception;

public class PaymentNotDoneException extends RuntimeException {
	public PaymentNotDoneException(String message) {
        super(message);
    }
}
