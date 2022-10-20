package EstruturaSequencial;

import javax.swing.JOptionPane;

public class _18_DownloadGUI {
    public static void main(String[] args) {
        // Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

        JOptionPane jop = new JOptionPane();

        // Variáveis
        double tamanho = Double.parseDouble(jop.showInputDialog("Digite o tamanho do arquivo em MB: "));

        double velocidade = Double.parseDouble(jop.showInputDialog("Digite a velocidade do link em Mbps: "));

        double tempo = (tamanho / velocidade) / 60;

        // Saída

        jop.showMessageDialog(null, "O tempo aproximado de download do arquivo é de " 
            + String.format("%.2f", tempo)
            + " minutos."
        );

    }
}