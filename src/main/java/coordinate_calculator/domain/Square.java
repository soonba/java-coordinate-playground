package coordinate_calculator.domain;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Set;

public class Square implements Figure {
    private final Points points;

    public Square(Points points) {
        this.points = validation(points);
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String getPrefixMessage() {
        return null;
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
