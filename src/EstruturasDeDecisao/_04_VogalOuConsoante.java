package EstruturasDeDecisao;

import javax.swing.JOptionPane;

public class _04_VogalOuConsoante {
    // Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Digite uma letra: ").charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            JOptionPane.showMessageDialog(null, "A letra digitada é uma vogal.");
        } else {
            JOptionPane.showMessageDialog(null, "A letra digitada é uma consoante.");
        } 
    }
}