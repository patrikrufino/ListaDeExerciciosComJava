package EstruturaSequencial;

import EstruturaSequencial.Helpers.Holerite;

import javax.swing.*;
import java.math.BigDecimal;

public class _15_HoleriteGUI {
    public static void main(String[] args) {

        BigDecimal salarioPorHora = new BigDecimal(JOptionPane.showInputDialog(
                "Digite o valor do seu salário: "
        ));

        BigDecimal horasTrabalhadas = BigDecimal.valueOf(Double.parseDouble(JOptionPane.showInputDialog(
                "Quantas horas você trabalhou esse mês?")
        ));

        JOptionPane.showMessageDialog(null, Holerite.geraHolerite(salarioPorHora, horasTrabalhadas));

        Holerite.geraHoleritetxt(salarioPorHora, horasTrabalhadas);
    }

}
