package coordinate_calculator.domain;

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
        return points;
    }
}
