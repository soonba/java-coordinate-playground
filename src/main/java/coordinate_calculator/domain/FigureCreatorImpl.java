package coordinate_calculator.domain;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureCreatorImpl implements FigureCreator{
    Map<Integer, Figure> figureMap = new HashMap<>();

    public FigureCreatorImpl(Points points) {
        figureMap.put(2, new Line(points));
        figureMap.put(3, new Triangle(points));
        figureMap.put(4, new Square(points));
    }

    @Override
    public Figure create(List<Point> points) {
        Figure figure = figureMap.getOrDefault(points.size(), null);
        if(figure == null) throw new InvalidParameterException("입력 가능한 포인트 개수는 2~4개 입니다.");
        return figure.validation();
    }
}
