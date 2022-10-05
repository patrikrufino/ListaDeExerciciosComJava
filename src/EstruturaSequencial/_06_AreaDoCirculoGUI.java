package EstruturaSequencial;

import javax.swing.*;

import static EstruturaSequencial.Helpers.GeometryAreas.circleArea;

public class _06_AreaDoCirculoGUI {
    public static void main(String[] args) {

        float raio = Float.parseFloat(JOptionPane.showInputDialog(
                "Digite o raio do círculo:"
        ));

        JOptionPane.showMessageDialog(null,
                "A area do circulo é:\n"
                + circleArea(raio)
                + "m²"
        );
    }
}
