package coordinate_calculator.domain;

import java.util.List;

public class Line implements Figure {

    private final Points points;

    public Line(Points points) {
        this.points = validation(points);
    }

    @Override
    public double getValue() {
        List<Point> pointList = points.toPointList();
        Point point1 = pointList.get(0);
        Point point2 = pointList.get(1);
        return getDistance(point1, point2);
    }

    @Override
    public String getPrefixMessage() {
        return "두 점 사이의 거리는 : ";
    }

    private double getDistance(Point point1, Point point2) {
        int x1 = point1.getX();
        int y1 = point1.getY();

        int x2 = point2.getX();
        int y2 = point2.getY();

        return Math.sqrt( Math.pow((x1-x2),2) + Math.pow((y1-y2),2) );
    }

    @Override
    public Points validation(Points points) {
        return points;
    }
}
