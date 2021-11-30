package ru.kpfu.itis.Lovchitskiy;

public class LaptopAccessException extends Exception{
    public LaptopAccessException() {
        super();
    }

    public LaptopAccessException(String message) {
        super(message);
    }

    public LaptopAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
