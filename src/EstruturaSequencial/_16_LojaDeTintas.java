package EstruturaSequencial;

import java.util.Scanner;

public class _16_LojaDeTintas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a área a ser pintada: ");

        double area = sc.nextDouble();
        
        double litros = area / 3;
        double latas = Math.ceil(litros / 18);

        System.out.println("Você precisará de " + latas + " latas de tinta.");

        double preco = latas * 80;

        System.out.println("O preço total será de R$ " + preco);

        sc.close();
        
    }
}