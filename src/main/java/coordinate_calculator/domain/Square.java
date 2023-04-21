package coordinate_calculator.domain;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Square implements Figure {
    private final Points points;

    public Square(Points points) {
        this.points = points;
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
    public Figure validation() {
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        Set<Point> pointSet = new HashSet<>();
        points.getPoints().forEach(point -> {
            xSet.add(point.getX());
            ySet.add(point.getY());
            pointSet.add(point);
        });
        if(xSet.size() != 2 || ySet.size() != 2 || pointSet.size() != 4) throw new InvalidParameterException("직사각형만 허용합니다.");
        return this;
    }
}
