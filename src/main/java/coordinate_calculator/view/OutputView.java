package coordinate_calculator.view;

import coordinate_calculator.domain.Point;

import java.util.List;

public class OutputView {

    private static final StringBuilder sb = new StringBuilder();
    private static final String AXIS_Y = "|";
    private static final String AXIS_X = "----";
    private static final String PADDING = " ";
    private static final String FOUR_PADDING = "    ";
    private static final String THREE_PADDING = "   ";
    private static final String TWO_PADDING = "  ";
    private static final String ORIGIN_POINT = "+";

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

    public static void drawMatrix(List<Point> initPoints) {
        for (int i = 24; i > 0; i--) {
            sb.append(makeYLine(i));
            makePoints(i,initPoints);
        }
        sb.append(PADDING).append(PADDING).append(ORIGIN_POINT);
        for (int i = 0; i < 24; i++) {
            sb.append(AXIS_X);
        }
        sb.append(NEXT_LINE).append(PADDING).append(PADDING);;
        for (int i = 0; i <= 24; i++) {
            makeXLine(i);
        }


        System.out.println(sb);


    }

    private static void makePoints(int i, List<Point> initPoints) {
        for (Point initPoint : initPoints) {
            appendIfPoints(i, initPoint);
        }
        sb.append(NEXT_LINE);
    }

    private static void appendIfPoints(int i,Point point) {
        if(i == point.getY()) {
            repeatPadding(point);
            sb.append("*");
        }
    }

    private static void repeatPadding(Point point) {
        for (int i = 0; i < point.getX(); i++) {
            sb.append(FOUR_PADDING);
        }
    }

    private static String makeXLine(int i) {
        if(i % 2 == 0) {
            sb.append(i);
            sb.append(FOUR_PADDING);
            return sb.toString();
        }
        if(i < 10) return sb.append(THREE_PADDING).toString();
        return sb.append(TWO_PADDING).toString();
    }


    private static String makeYLine(int i) {
        StringBuilder sb = new StringBuilder();
        if(i<10) sb.append(PADDING);
        if(i%2 ==0) {
            return sb.append(i).append(AXIS_Y).toString();
        }
        if(i>10) sb.append(PADDING);
        return sb.append(PADDING).append(AXIS_Y).toString();
    }
}
