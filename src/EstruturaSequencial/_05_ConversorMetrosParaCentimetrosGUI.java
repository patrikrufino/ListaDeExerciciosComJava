package EstruturaSequencial;

// Exercício:
// Faça um Programa que converta metros para centímetros.

import javax.swing.*;

import static EstruturaSequencial.Helpers.Converters.converterMetersToCentimeters;

public class _05_ConversorMetrosParaCentimetrosGUI {
    public static void main(String[] args) {

        float meters =  Float.parseFloat(JOptionPane.showInputDialog(
                "Digite sua medida em metros:")
        );

        JOptionPane.showMessageDialog(null,
                "Conversão completa:\n"
                + meters
                + "M = "
                + converterMetersToCentimeters(meters)
                + "CM"
        );
    }
}


