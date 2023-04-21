package coordinate_calculator.domain;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Square implements Figure {
    private final Points points;

    public Square(Points points) {
        this.points = validation(points);
    }

    @Override
    public double getValue() {
        List<Point> pointList = points.getPoints();
        pointList.sort((point1, point2) -> {
            if(point1.getX() == point2.getX()) {
                return point1.getY() - point2.getY();
            }
            return point1.getX() - point2.getX();
        });
        Point leftBottomPoint = pointList.get(0);
        Point rightTopPoint = pointList.get(3);
        return (rightTopPoint.getX() - leftBottomPoint.getX()) * (rightTopPoint.getY() - leftBottomPoint.getY());
    }

    @Override
    public String getPrefixMessage() {
        return "사각형 넓이는 ";
    }

    @Override
    public Points validation(Points points) {
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        points.getPoints().forEach(point -> {
            xSet.add(point.getX());
            ySet.add(point.getY());
        });
        if(xSet.size() != 2 || ySet.size() != 2) throw new InvalidParameterException("직사각형만 허용합니다.");
        return points;
    }
}
