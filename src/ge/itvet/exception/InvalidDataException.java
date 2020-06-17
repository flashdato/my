package ge.itvet.exception;

public class InvalidDataException extends ConvertException{
    public InvalidDataException(String message) {
        super(message);
    }

    public InvalidDataException() {
    }
}
