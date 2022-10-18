package EstruturaSequencial.Helpers;

import java.util.Objects;

public class Calculos {
    public static double pesoIdeal ( double h, String gener) {
        if (Objects.equals(gener, "m") || Objects.equals(gener, "M")) {
            return (72.7 * h) - 58;
        } else {
            return (62.1 * h) - 44.7;
        }
    }
}
