package EstruturaSequencial;

import java.util.Scanner;

import static EstruturaSequencial.Helpers.Converters.celsiusToFahrenheit;

public class _10_CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o graus Celsius:");
        float grausCelsius = sc.nextFloat();

        System.out.println(grausCelsius
                + "ºC = "
                + celsiusToFahrenheit(grausCelsius)
                + "ºF"
        );
    }
}
