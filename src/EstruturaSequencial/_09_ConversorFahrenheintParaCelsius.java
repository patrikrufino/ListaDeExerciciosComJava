package EstruturaSequencial;

import java.util.Scanner;

import static EstruturaSequencial.Helpers.Converters.fahrenheitToCelsius;

public class _09_ConversorFahrenheintParaCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua temperatura em graus Fahrenheit:");
        float grausInFahrenheit = sc.nextFloat();

        System.out.println("Sua temperatura convertida para graus Celsius é:\n"
                + fahrenheitToCelsius(grausInFahrenheit)
                + "ªC"
        );
    }
}
