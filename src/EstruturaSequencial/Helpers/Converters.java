package EstruturaSequencial.Helpers;

public class Converters {
    public static float converterMetersToCentimeters (float m) {
        return m * 100;
    }

    public static float fahrenheitToCelsius(float f) {
        return 5 * ((f - 32 ) / 9);
    }

    public static float celsiusToFahrenheit(float c ) {
        return (c * 9/5 ) + 32;
    }
}
