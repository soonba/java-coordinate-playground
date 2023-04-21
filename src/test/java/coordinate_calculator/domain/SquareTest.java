package coordinate_calculator.domain;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SquareTest {

    private Square square;

    @BeforeEach
    void setUp() {
        Points points = new Points(new ArrayList<>(List.of(new Point(1, 1), new Point(2, 2), new Point(1,2),new Point(2,1))));
        square = new Square(points);
    }

    @Test
    void 사각형조건불만족() {
        assertThatThrownBy(() -> {
            Points points = new Points(new ArrayList<>(List.of(new Point(1, 1), new Point(2, 2), new Point(1,2),new Point(2,1))));
            square = new Square(points);
        }).isInstanceOf(InvalidParameterException.class);
    }
}
