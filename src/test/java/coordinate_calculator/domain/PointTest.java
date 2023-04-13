package coordinate_calculator.domain;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {

    @Test
    public void 초과된_점() {
        assertThatThrownBy(() -> {
            Point point = new Point(0, 25);
        }).isInstanceOf(InvalidParameterException.class);
    }

    @Test
    public void 범위내_점() {
        Point point = new Point(0, 1);
        assertThat(point).isEqualTo(new Point(0, 1));
    }
}
