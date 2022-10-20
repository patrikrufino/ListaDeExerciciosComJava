package EstruturaSequencial;

import javax.swing.*;

import static java.lang.Integer.sum;

public class _03_SomaGUI {

    public static void main(String[] args) {

        int numberOne = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        JOptionPane.showMessageDialog(null,
                "A soma desses numeros é:\n" + sum(numberTwo, numberOne));
    }


}
