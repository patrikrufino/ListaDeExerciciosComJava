package EstruturaSequencial;

import java.util.ArrayList;
import java.util.Scanner;

import static EstruturaSequencial.Helpers.ArrayListOperations.getAverage;

public class _04_NotasBimestrais {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        ArrayList<Double> notes = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota do " + (i+1) + "º bimestre:");
            notes.add(readInput.nextDouble());
        }

        System.out.println("A média das notas é:\n" + getAverage(notes));
    }
}
