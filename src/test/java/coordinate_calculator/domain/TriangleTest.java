package coordinate_calculator.domain;

import com.sun.tools.javac.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    void setUp() {
//        (10,10)-(14,15)-(20,8)
        Points points = new Points(new ArrayList<>(List.of(new Point(10, 10), new Point(14, 15), new Point(20, 8))));
        triangle = new Triangle(points);
    }


    @Test
    void 값_계산() {
        double value = triangle.getValue();
        Assertions.assertThat(value).isEqualTo(29);
    }
}
