package coordinate_calculator;

import coordinate_calculator.domain.Points;
import coordinate_calculator.view.InputView;
import coordinate_calculator.view.OutputView;


public class Controller {

    public void run() {
        Points initPoints = init();
        OutputView.drawMatrix(initPoints);
//        OutputView.print();
    }

    private static Points init() {
        try {
            OutputView.initMessage();
            return InputView.initPoints();
        } catch (Exception e) {
            OutputView.errorMessage();
            return init();
        }
    }
}
