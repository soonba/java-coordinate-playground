package coordinate_calculator.domain;

import java.util.List;

public interface FigureCreator {
    Figure create(List<Point> points);
}
