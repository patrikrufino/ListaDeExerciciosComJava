package EstruturasDeDecisao;

import javax.swing.JOptionPane;

public class _02_PositivoOuNegativo {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número é positivo");
        } else {
            JOptionPane.showMessageDialog(null, "O número é negativo");
        }

        // Verifica se o usuário quer continuar ou encerrar o programa
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar?", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            main(null);
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado");
        }
    }
}