package EstruturaSequencial.Helpers;

import java.util.ArrayList;

public class ArrayListOperations {
    public static double getAverage(ArrayList<Double> list) {
        long sum = 0;

        for (double i: list) {
            sum += i;
        }

        return list.size() > 0 ? (double) sum / list.size() : 0;
    }
}
