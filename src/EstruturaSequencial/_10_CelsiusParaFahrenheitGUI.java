package EstruturaSequencial;

import javax.swing.*;

import static EstruturaSequencial.Helpers.Converters.celsiusToFahrenheit;

public class _10_CelsiusParaFahrenheitGUI {

    public static void main(String[] args) {
        float grausCelsius = Float.parseFloat(JOptionPane.showInputDialog("Digite o graus celsius:"));

        JOptionPane.showMessageDialog(null,
                grausCelsius
                        + "ºC = "
                        + celsiusToFahrenheit(grausCelsius)
                        + "ºF"
        );
    }

}
