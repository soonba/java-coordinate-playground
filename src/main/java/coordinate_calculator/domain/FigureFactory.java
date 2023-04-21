package coordinate_calculator.domain;

import java.security.InvalidParameterException;

public class FigureFactory {

    public static final int SIZE_LINE = 2;
    private static final int SIZE_SQUARE = 4;

    public static Figure getInstance(Points points) {
        int size = points.getSize();
        if(size == SIZE_LINE) return new Line(points);
        if(size == SIZE_SQUARE) return new Square(points);
        throw new InvalidParameterException("dd");
    }
}
