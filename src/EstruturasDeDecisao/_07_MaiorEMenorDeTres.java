package EstruturasDeDecisao;

import java.util.Scanner;

public class _07_MaiorEMenorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, maior, menor;

        maior = 0;
        menor = 0;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.println("Digite o terceiro número: ");
        n3 = sc.nextDouble();

        if (n1 > maior) {
            maior = n1;
        } if (n2 > maior) {
            maior = n2;
        } if (n3 > maior) {
            maior = n3;
        }

        if (n1 > menor) {
            menor = n1;
        } if (n2 < menor) {
            menor = n2;
        } if (n3 < menor) {
            menor = n3;
        }

        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);
    }
}