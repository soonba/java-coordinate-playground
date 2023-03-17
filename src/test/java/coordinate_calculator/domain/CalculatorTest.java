package coordinate_calculator.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class CalculatorTest {

    @Test
    void 직선_계산기() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        List<Point> pointList = new ArrayList<>();
        pointList.add(point1);
        pointList.add(point2);
        Calculator calculator = new LineCalculator(pointList);
        double result = calculator.calculate();
        assertThat(result).isEqualTo(4.9999, offset(0.00099));
    }
}
