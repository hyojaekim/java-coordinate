package coordinate.domain.figure;

import coordinate.domain.InvalidFigureException;

public enum FigureType {
    LINE(2), TRIANGLE(3), RECTANGLE(4);

    private final int number;

    FigureType(int number) {
        this.number = number;
    }

    public static FigureType valueOf(int size) throws InvalidFigureException {
        for (FigureType value : values()) {
            if(value.number == size) {
                return value;
            }
        }
        throw new InvalidFigureException("유효하지 않은 도형입니다.");
    }
}
