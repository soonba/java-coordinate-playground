package coordinate_calculator.view;

import coordinate_calculator.domain.Point;
import coordinate_calculator.domain.Points;

public class OutputView {

    private static final StringBuilder sb = new StringBuilder();
    private static final String AXIS_Y = "|";
    private static final String AXIS_X = "----";
    private static final String FOUR_PADDING = "    ";
    private static final String THREE_PADDING = "   ";
    private static final String TWO_PADDING = "  ";
    private static final String ORIGIN_POINT = "+";
    private static final String POINT = "*";

    private static final String NEXT_LINE = "\n";

    public static void initMessage() {
        System.out.println("좌표를 입력하세요.");
    }

    public static void errorMessage() {
        System.out.println("좌표는 0부터 24사이이며, 다음 포멧을 준수해주세요.");
        System.out.println("[예시] (10,10)-(14,15)");
    }

    public static void print(String result) {
        System.out.println(result);
    }

    public static void drawMatrix(Points initPoints) {
        makeYLineNumberPoints(initPoints);
        makeXLine();
        makeXNumbers();
        System.out.println(sb);
    }

    private static void makeYLineNumberPoints(Points initPoints) {
        for (int i = Point.MAX_VALUE; i > Point.MIN_VALUE; i--) {
            makeYLineAndNumber(i);
            makePoints(i, initPoints);
        }
    }

    private static void makeYLineAndNumber(int i) {
        if (isEven(i)) {
            sb.append(String.format("%-2d", i)).append(AXIS_Y);
            return;
        }
        sb.append(TWO_PADDING).append(AXIS_Y);
    }

    private static void makePoints(int i, Points initPoints) {
        int correction = 0;
        for (Point aPoint : initPoints.toPointList()) {
            correction += appendIfPoint(i, aPoint, correction);
        }
        sb.append(NEXT_LINE);
    }

    private static int appendIfPoint(int i, Point point, int correction) {
        if (i == point.getY()) {
            makePoint(point, correction);
            return point.getX();
        }
        return 0;
    }

    private static void makePoint(Point point, int correction) {
        for (int i = correction; i < point.getX() - 1; i++) {
            sb.append(FOUR_PADDING);
        }
        sb.append(THREE_PADDING).append(POINT);
    }

    private static void makeXLine() {
        sb.append(TWO_PADDING).append(ORIGIN_POINT);
        for (int i = Point.MIN_VALUE; i < Point.MAX_VALUE; i++) {
            sb.append(AXIS_X);
        }
        sb.append(NEXT_LINE);
    }

    private static void makeXNumbers() {
        for (int i = Point.MIN_VALUE; i <= Point.MAX_VALUE; i++) {
            makeXNumber(i);
        }
    }

    private static void makeXNumber(int i) {
        sb.append(TWO_PADDING);
        if (isEven(i)) {
            sb.append(String.format("%-4d", i));
        }
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
