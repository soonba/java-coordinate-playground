package coordinate_calculator;

import coordinate_calculator.domain.Figure;
import coordinate_calculator.domain.FigureFactory;
import coordinate_calculator.domain.Points;
import coordinate_calculator.view.InputView;
import coordinate_calculator.view.OutputView;


public class Controller {

    public void run() {
        Points points = init();
        Figure figure = FigureFactory.getInstance(points);
        double value = figure.getValue();
        String prefixMessage = figure.getPrefixMessage();
        OutputView.drawMatrix(points);
        OutputView.print(prefixMessage,value);
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
