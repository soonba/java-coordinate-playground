package coordinate_calculator.domain;

import java.util.List;

public class Points {
    private final List<Point> points;

    public Points(List<Point> points) {
        this.points = points;
    }

    public List<Point> toPointList() {
        return points;
    }

    public int getSize() {
        return points.size();
    }
}
