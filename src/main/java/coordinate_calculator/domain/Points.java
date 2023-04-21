package coordinate_calculator.domain;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Points {
    public static final int LINE_SIZE = 2;
    public static final int SQUARE_SIZE = 4;
    private final List<Point> points;

    public Points(List<Point> points) {
        this.points = validationPoints(points);
    }

    private List<Point> validationPoints(List<Point> points) {
        if(isLine()) return points;

        if(isSquare()) validateSquare(points);
        return points;
    }

    private static void validateSquare(List<Point> points) {
        Set<Integer> setX = new HashSet<>();
        points.forEach(point -> setX.add(point.getX()));

        Set<Integer> setY = new HashSet<>();
        points.forEach(point -> setY.add(point.getY()));
        if(setX.size() != 2 || setY.size() != 2) throw new InvalidParameterException("직사각형이어야 합니다.");
    }

    public boolean isLine() {
        return points.size() == LINE_SIZE;
    }

    public boolean isSquare() {
        return points.size() == SQUARE_SIZE;
    }

    public List<Point> getPoints() {
        return points;
    }
}
