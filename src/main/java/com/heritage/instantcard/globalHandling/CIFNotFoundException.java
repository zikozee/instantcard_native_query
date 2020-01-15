package com.heritage.instantcard.globalHandling;

public class CIFNotFoundException extends RuntimeException {
    public CIFNotFoundException(String message) {
        super(message);
    }
    public CIFNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CIFNotFoundException(Throwable cause) {
        super(cause);
    }
}
