package ru.kpfu.itis.Lovchitskiy;

public class WrongInputException extends Exception{
    public WrongInputException() {
        super();
    }

    public WrongInputException(String message) {
        super(message);
    }

    public WrongInputException(String message, Throwable cause) {
        super(message, cause);
    }
}
