package ru.kpfu.itis.Lovchitskiy;

public class IllegalChargeException extends WrongInputException{
    public IllegalChargeException() {
        super();
    }

    public IllegalChargeException(String message) {
        super(message);
    }

    public IllegalChargeException(String message, Throwable cause) {
        super(message, cause);
    }
}
