package coordinate_calculator.domain;

import java.util.List;

public class LineCalculator implements Calculator {
    private final Point pointA;
    private final Point pointB;
    public LineCalculator(List<Point> pointList) {
        pointA = pointList.get(0);
        pointB = pointList.get(1);
    }

    @Override
    public String printResult() {
        return "두 점 사이 거리는 " + (int) Math.sqrt(Math.pow((pointA.getX()-pointB.getX()),2) + Math.pow((pointA.getY()-pointB.getY()),2));
    }
}
