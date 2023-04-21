package coordinate_calculator.domain;

public interface Figure {
    void validation(Points points);

    double getValue();
    String getPrefixMessage();
}
