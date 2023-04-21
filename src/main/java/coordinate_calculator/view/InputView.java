package coordinate_calculator.view;

import coordinate_calculator.domain.Point;
import coordinate_calculator.domain.Points;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Points initPoints() throws Exception {
        String[] split = br.readLine().split("-");
        List<Point> points = new ArrayList<>();
        Arrays.stream(split).forEach(s -> {
            int[] pointArr = parsePoint(s);
            points.add(new Point(pointArr[0],pointArr[1]));
        });
        return new Points(points);
    }

    private static int[] parsePoint(String str) {
        int[] result = new int[2];
        String[] split = str.split(",");
        result[0] = Integer.parseInt(split[0].substring(1));
        result[1] = Integer.parseInt(split[1].substring(0,split[1].length()-1));
        return result;
    }
}

