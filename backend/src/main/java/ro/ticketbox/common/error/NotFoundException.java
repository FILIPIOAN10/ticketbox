package ro.ticketbox.common.error;

public class NotFoundException extends RuntimeException {
    public NotFoundException() { super("Resursa nu există"); }
    public NotFoundException(String message) { super(message); }
}