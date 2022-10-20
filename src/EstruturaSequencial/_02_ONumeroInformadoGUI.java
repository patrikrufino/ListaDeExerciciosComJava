package EstruturaSequencial;

import javax.swing.*;

public class _02_ONumeroInformadoGUI {

    public static void main(String[] args) {
        int informedNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        var message = "O número informado foi ";

        var completeMessage = message + informedNumber;

        JOptionPane.showMessageDialog(null, completeMessage);
    }

}
