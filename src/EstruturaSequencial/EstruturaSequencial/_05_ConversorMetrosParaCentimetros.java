package EstruturaSequencial;

// Exercício:
// Faça um Programa que converta metros para centímetros.

import java.util.Scanner;

import static EstruturaSequencial.Helpers.Converters.converterMetersToCentimeters;

public class _05_ConversorMetrosParaCentimetros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua medida em metros");
        float meters = sc.nextFloat();

        System.out.println(meters
                + "M = "
                + converterMetersToCentimeters(meters)
                + "CM");
    }
}
