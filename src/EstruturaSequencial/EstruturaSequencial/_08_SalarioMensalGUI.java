package EstruturaSequencial;

import javax.swing.*;

public class _08_SalarioMensalGUI {
    public static void main(String[] args) {
        float salaryHour = Float.parseFloat(JOptionPane.showInputDialog(
                "Quanto você recebe por hora trabalhada?"
        ));

        float hoursWorked = Float.parseFloat(JOptionPane.showInputDialog(
                "Quantas horas você trabalhou este mês?"
        ));

        JOptionPane.showMessageDialog(null, "Seu salário este mês será de: \n R$"
                + (salaryHour * hoursWorked)
        );
    }
}
