package EstruturaSequencial;

import javax.swing.*;

import static EstruturaSequencial.Helpers.Converters.fahrenheitToCelsius;

public class _09_ConversorFahrenheintParaCelsiusGUI {
    public static void main(String[] args) {
        float grausInFahrenheit = Float.parseFloat(JOptionPane.showInputDialog(
                "Digite sua temperatura em graus em Fahrenheit"
        ));

        JOptionPane.showMessageDialog(null,
                "Sua temperatura em graus Celsius é:\n"
                + fahrenheitToCelsius(grausInFahrenheit)
                + "ºC"
        );
    }
}
