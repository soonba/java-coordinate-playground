package coordinate_calculator.domain;

import java.security.InvalidParameterException;
import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public static final int MAX_VALUE = 24;
    public static final int MIN_VALUE = 0;

    public Point(int x, int y) {
        this.x = validation(x);
        this.y = validation(y);
    }

    private int validation(int coordinateValue) {
        if(coordinateValue > MAX_VALUE || coordinateValue < MIN_VALUE) {
            throw new InvalidParameterException("좌표의 값은 0에서 24 사이입니다.");
        }
        return coordinateValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
