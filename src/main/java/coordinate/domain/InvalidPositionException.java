package coordinate.domain;

public class InvalidPositionException extends RuntimeException {
    InvalidPositionException(String message) {
        super(message);
    }
}
