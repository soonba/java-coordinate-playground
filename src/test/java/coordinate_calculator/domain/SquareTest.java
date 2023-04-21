package coordinate_calculator.domain;

import com.sun.tools.javac.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SquareTest {

    private Square square;

    @BeforeEach
    void setUp() {
        Points points = new Points(new ArrayList<>(List.of(new Point(1, 1), new Point(3, 1), new Point(1,7),new Point(3,7))));
        square = new Square(points);
    }

    @Test
    void 사각형조건불만족_직사각형아님() {
        assertThatThrownBy(() -> {
            Points points = new Points(new ArrayList<>(List.of(new Point(1, 1), new Point(2, 2), new Point(3,2),new Point(2,1))));
            square = new Square(points);
        }).isInstanceOf(InvalidParameterException.class);
    }

    @Test
    void 사각형조건불만족_중복점() {
        assertThatThrownBy(() -> {
            Points points = new Points(new ArrayList<>(List.of(new Point(10, 10), new Point(14, 15), new Point(10,10),new Point(14,15))));
            square = new Square(points);
        }).isInstanceOf(InvalidParameterException.class);
    }

    @Test
    void 값_계산() {
        double value = square.getValue();
        Assertions.assertThat(value).isEqualTo(12);
    }
}
