package coordinate_calculator.domain;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class LineTest {

    private Line line;

    @BeforeEach
    void setUp() {
        Points points = new Points(new ArrayList<>(List.of(new Point(1, 1), new Point(2, 2))));
        line = new Line(points);
    }

    @Test
    void 값_계산() {
        double value = line.getValue();
        assertThat(value).isEqualTo(1.414,offset(0.0009));
    }
}
