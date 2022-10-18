package EstruturaSequencial;

import javax.swing.*;

import static EstruturaSequencial.Helpers.GeometryAreas.squareArea;

public class _07_AreaQuadradoEmDobroGUI {
    public static void main(String[] args) {
        float sideSize = Float.parseFloat(JOptionPane.showInputDialog(
                "Digite o tamanho de um dos lados do quadrado:"
        ));

        JOptionPane.showMessageDialog(null,
                "A area do quadrado é igual: "
                + squareArea(sideSize)
                + " cm²"
                + "\nO dobro desta área é: "
                + (squareArea(sideSize) * 2)
                + " cm²"
        );

    }
}
