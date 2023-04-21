package coordinate_calculator.domain;

public interface Figure {
    Figure validation();

    double getValue();
    String getPrefixMessage();
}
