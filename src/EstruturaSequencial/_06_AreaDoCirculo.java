package EstruturaSequencial;

import java.util.Scanner;

import static EstruturaSequencial.Helpers.GeometryAreas.circleArea;

public class _06_AreaDoCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do círculo a seguir:");
        float raio = sc.nextFloat();

        System.out.println("A area do círculo é:\n"
            + circleArea(raio)
            + "m²"
        );
    }
}
