package ru.kpfu.itis.Lovchitskiy;

public class CriticalTempException extends Exception{
    public CriticalTempException() {
        super();
    }

    public CriticalTempException(String message) {
        super(message);
    }

    public CriticalTempException(String message, Throwable cause) {
        super(message, cause);
    }
}
