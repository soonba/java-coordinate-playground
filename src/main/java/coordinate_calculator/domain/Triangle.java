package coordinate_calculator.domain;

import java.util.List;

public class Triangle implements Figure {

    private final Points points;

    public Triangle(Points points) {
        this.points = validation(points);
    }

    @Override
    public double getValue() {
        List<Point> pointList = points.getPoints();
        Point point1 = pointList.get(0);
        int x1 = point1.getX();
        int y1 = point1.getY();

        Point point2 = pointList.get(1);
        int x2 = point2.getX();
        int y2 = point2.getY();

        Point point3 = pointList.get(2);
        int x3 = point3.getX();
        int y3 = point3.getY();

        return Math.abs(((x1*y2)+(x2*y3)+(x3*y1))-((x2*y1)+(x3*y2)+(x1*y3)))*0.5;
    }

    @Override
    public String getPrefixMessage() {
        return "삼각형 넓이는 ";
    }

    @Override
    public Points validation(Points points) {
        return points;
    }
}
