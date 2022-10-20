package EstruturaSequencial;

import java.util.Scanner;

import static EstruturaSequencial.Helpers.Calculos.pesoIdeal;

public class _13_PesoIdealGeneros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double height = sc.nextDouble();

        System.out.println("Seu você é homem, seu peso ideal é:\n "
                            + String.format("%.3f", pesoIdeal(height, "M")) + "Kg"
                            + "\nSe você é mulher, seu peso ideal é:\n"
                            + String.format("%.3f", pesoIdeal(height, "F")) + "Kg"
        );
    }


}
