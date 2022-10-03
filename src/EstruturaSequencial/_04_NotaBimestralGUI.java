package EstruturaSequencial;

import javax.swing.*;
import java.util.ArrayList;

import static EstruturaSequencial.Helpers.ArrayListOperations.getAverage;

public class _04_NotaBimestralGUI {
    public static void main(String[] args) {
        ArrayList<Double> notes = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            double note = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digite a nota do " + (i+1) + "º bimestre"
            ));

            notes.add(note);
        }

        JOptionPane.showMessageDialog(null,
                "A média das notas é:\n"
                + getAverage(notes)
        );
    }


}
