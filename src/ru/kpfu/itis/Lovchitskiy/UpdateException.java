package ru.kpfu.itis.Lovchitskiy;

public class UpdateException extends Exception{
    public UpdateException() {
        super();
    }

    public UpdateException(String message) {
        super(message);
    }

    public UpdateException(String message, Throwable cause) {
        super(message, cause);
    }
}
