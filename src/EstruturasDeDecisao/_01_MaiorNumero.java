package EstruturasDeDecisao;

import javax.swing.JOptionPane;

public class _01_MaiorNumero {
    public static void main(String[] args) {
        double numeroUm;
        double numeroDois;

        numeroUm = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));

        numeroDois = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));

        if (numeroUm > numeroDois) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numeroUm);
        } else {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numeroDois);
        }

    }
}