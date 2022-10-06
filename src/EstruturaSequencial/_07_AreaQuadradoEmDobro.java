package EstruturaSequencial;

import java.util.Scanner;

import static EstruturaSequencial.Helpers.GeometryAreas.squareArea;

public class _07_AreaQuadradoEmDobro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho de um dos lados do quadrado: ");
        float sideSize = sc.nextFloat();

        System.out.println("A area deste quadrado é:");
        System.out.println(squareArea(sideSize) + " cm²");
        System.out.println("O dobro desta área é: ");
        System.out.println((squareArea(sideSize) * 2) + " cm²");
    }
}
