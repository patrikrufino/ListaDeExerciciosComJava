package EstruturaSequencial;

import java.util.Scanner;

public class _11_CalculosComNumerosReaisEInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numberIntOne = sc.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int numberIntTwo = sc.nextInt();

        System.out.println("Digite um número real");
        float numberFloat = sc.nextFloat();

        System.out.println("O produto do dobro do primeiro com metade do segundo: \n"
                            + dobroMaisMetade(numberIntOne, numberIntTwo)
        );

        System.out.println("A soma do triplo do primeiro com o terceiro:\n"
                            + somaTriploMaisMetade(numberIntOne, numberFloat)
        );

        System.out.println("O terceiro elevado ao cubo: \n"
                            + elevaAoCubo(numberFloat)
        );
    }

    public static float dobroMaisMetade(int a, int b) {
        return (a * 2) + (Float.parseFloat(String.valueOf(b)) / 2);
    }

    public static float somaTriploMaisMetade(int a, float b) {
        return (a * 3) + b;
    }

    public static float elevaAoCubo(float a) {
        return a * a * a;
    }
}

//