package EstruturaSequencial;

import java.util.Scanner;

import static EstruturaSequencial.Helpers.Calculos.pesoIdeal;

public class _12_PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura:");

        double height = sc.nextDouble();

        System.out.println("Seu peso ideal é:\n"
                            + String.format("%.3f", pesoIdeal(height, "m"))
                            + "Kg"
        );

    }
}
