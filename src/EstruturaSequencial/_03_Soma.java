package EstruturaSequencial;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.sum;

public class _03_Soma {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        int[] numbers = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite um número a seguir:");
            numbers[i] = readInput.nextInt();
        }

        System.out.println("A soma destes números é:\n" + sum(numbers[0], numbers[1]));

    }
}
