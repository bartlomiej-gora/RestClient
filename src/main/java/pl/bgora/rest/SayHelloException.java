package pl.bgora.rest;

public class SayHelloException extends Exception {
    public SayHelloException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
