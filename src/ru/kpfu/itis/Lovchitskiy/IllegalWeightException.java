package ru.kpfu.itis.Lovchitskiy;

public class IllegalWeightException extends WrongInputException{
    public IllegalWeightException() {
        super();
    }

    public IllegalWeightException(String message) {
        super(message);
    }

    public IllegalWeightException(String message, Throwable cause) {
        super(message, cause);
    }
}
