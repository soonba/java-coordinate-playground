package coordinate_calculator.domain;

import java.security.InvalidParameterException;

public class FigureFactory {

    public static final int SIZE_LINE = 2;
    private static final int SIZE_SQUARE = 4;
    public static final int SIZE_TRIANGLE = 3;

    public static Figure getInstance(Points points) {
        int size = points.getSize();
        if(size == SIZE_LINE) return new Line(points);
        if(size == SIZE_SQUARE) return new Square(points);
        if(size == SIZE_TRIANGLE) return new Triangle(points);
        throw new InvalidParameterException("입력 가능한 포인트 개수는 2~4개 입니다.");
    }
}
