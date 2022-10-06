package EstruturaSequencial;

import java.util.Scanner;

public class _08_SalarioMensal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você recebe por hora trabalhada?");
        float salaryHour = sc.nextFloat();

        System.out.println("Quantas horas você trabalhou este mês?");
        float hoursWorked = sc.nextFloat();

        System.out.println("Seu salário estê mês será de: \n R$"
            + (salaryHour * hoursWorked)
        );
    }
}
