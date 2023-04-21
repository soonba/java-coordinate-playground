package coordinate_calculator.domain;

import java.security.InvalidParameterException;

public class FigureFactory {
    public static Figure getInstance(Points points) {
        FigureCreatorImpl figureCreator = new FigureCreatorImpl(points);
        return figureCreator.create(points.getPoints());
    }
}
