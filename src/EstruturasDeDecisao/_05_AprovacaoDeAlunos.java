package EstruturasDeDecisao;

import javax.swing.JOptionPane;

public class _05_AprovacaoDeAlunos {
    public static void main(String[] args) {
        double notaUm;
        double notaDois;
        double media;

        notaUm = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));

        notaDois = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));

        media = (notaUm + notaDois) / 2;

        if (media >= 7 && media < 10) {
            JOptionPane.showMessageDialog(null, "Aluno aprovado com média: " + media);
        } if (media == 10) {
            JOptionPane.showMessageDialog(null, "Aluno aprovado com Distinção, com média: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno reprovado com média: " + media);
        }

        // Verifica se o usuário quer continuar ou encerrar o programa
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja tentar com novo aluno?", "Novo aluno?", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            main(null);
        } else {
            JOptionPane.showMessageDialog(null, "Programa encerrado");
        }
    }
}