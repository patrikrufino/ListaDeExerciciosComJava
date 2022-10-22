package EstruturasDeDecisao;

import javax.swing.JOptionPane;

public class _03_MasculinoOuFeminino {
    public static void main(String[] args) {
        char sexo;

        sexo = 'M';

        sexo = JOptionPane.showInputDialog("Digite o sexo: ").charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            JOptionPane.showMessageDialog(null, "O sexo é Masculino");
        } else if (sexo == 'F' || sexo == 'f') {
            JOptionPane.showMessageDialog(null, "O sexo é Feminino");
        } else {
            JOptionPane.showMessageDialog(null, "Sexo inválido");
        }

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar?", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            main(null);
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado");
        }
    }
    
}