package io.reqres.main.exceptions;

import java.io.IOException;

public class exceptionLoadProperties extends RuntimeException {
    public exceptionLoadProperties(String message, IOException e) {
        super(message,e);
    }
}
