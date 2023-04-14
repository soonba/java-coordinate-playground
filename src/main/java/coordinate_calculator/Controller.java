package coordinate_calculator;

import coordinate_calculator.domain.Calculator;
import coordinate_calculator.domain.LineCalculator;
import coordinate_calculator.domain.Point;
import coordinate_calculator.view.InputView;
import coordinate_calculator.view.OutputView;

import java.security.InvalidParameterException;
import java.util.List;

public class Controller {

    private Calculator calculator;

    public void run() {
        List<Point> initPoints = init();
        calculator = getCalculator(initPoints);
        String result = calculator.printResult();
        OutputView.drawMatrix(initPoints);
        OutputView.print(result);
    }

    private Calculator getCalculator(List<Point> points) {
        if (points.size() == 2) {
            return new LineCalculator(points);
        }
        throw new InvalidParameterException("dd");
    }


    private static List<Point> init() {
        try {
            OutputView.initMessage();
            return InputView.initPoints();
        } catch (Exception e) {
            OutputView.errorMessage();
            return init();
        }
    }
}
