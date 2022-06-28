package com.varun.scyther.io.nace.exception;

public class NaceDetailsNotFoundException extends RuntimeException{
    public NaceDetailsNotFoundException(Long orderId) {
        super("No details found for Nace " + orderId);
    }
}
