package EstruturaSequencial;

import java.util.Scanner;

public class _02_ONumeroInformado {
    public static void main(String[] args) {

        Scanner readInput = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int number = readInput.nextInt();

        System.out.println("O numero informado é " + number);
    }
}
