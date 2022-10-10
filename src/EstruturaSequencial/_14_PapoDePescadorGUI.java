package EstruturaSequencial;

import javax.swing.*;

public class _14_PapoDePescadorGUI {
    public static void main(String[] args) {
        double valorDaMulta = 4d;
        double excesso;
        double limiteDePeso = 50d;
        double pesoDePeixes = Double.parseDouble(JOptionPane.showInputDialog(
                "Quantos kilos de peixes você está trazendo hoje?"
        ));

        if(pesoDePeixes >= limiteDePeso) {
            excesso = pesoDePeixes - limiteDePeso;
            double multaTotal = excesso * valorDaMulta;

            JOptionPane.showMessageDialog(null,
                    "Total de peso alem do limite: "
                    + String.format("%.3f",excesso)
                    + "kg\n\n"
                    + "Multa a ser paga: R$"
                    + String.format("%.2f", multaTotal)
            );
        } else {
            JOptionPane.showMessageDialog(null,
                    "Dessa vez, você não precisará pagar multa!"
            );
        }
    }
}
