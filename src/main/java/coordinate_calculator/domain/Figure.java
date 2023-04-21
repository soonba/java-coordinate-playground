package coordinate_calculator.domain;

public interface Figure {
    Points validation(Points points);

    double getValue();
    String getPrefixMessage();
}
